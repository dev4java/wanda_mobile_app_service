
package iMobile.dao.base;

import iMobile.bean.SysUser;
import iMobile.utils.DateUtil;
import iMobile.utils.LogTime;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.incrementer.OracleSequenceMaxValueIncrementer;

public abstract class AbstractDao<T, PK extends Serializable> extends JdbcDaoSupport implements CommonDao<T, PK>
{
	protected Log	logger	= LogFactory.getLog(AbstractDao.class);
	
	@Autowired
	public void setJdbc(JdbcTemplate jdbcTemplate)
	{
		super.setJdbcTemplate(jdbcTemplate);
	}
	
	protected abstract Class<T> getClassType();
	
	protected String getClassSimpleName()
	{
		return this.getClassType().getSimpleName();
	}
	
	public String getTableName()
	{
		Table table = this.getClassType().getAnnotation(Table.class);
		return table.name();
	}
	
	public Long getSequenceLongValue()
	{
		SequenceGenerator sequenceGenerator = this.getClassType().getAnnotation(SequenceGenerator.class);
		OracleSequenceMaxValueIncrementer seq = new OracleSequenceMaxValueIncrementer(this.getDataSource(), sequenceGenerator.name());
		return seq.nextLongValue();
	}
	
	public T save(T instance)
	{
		LogTime logTime = new LogTime();
		logTime.begin();
		
		StringBuffer insert = new StringBuffer();
		insert.append("insert into ");
		insert.append(DaoUtil.getTableName(this.getClassType()));
		insert.append("(");
		StringBuffer values = new StringBuffer();
		values.append("values(");
		Field[] fields = this.getClassType().getDeclaredFields();
		for (int i = 0; i < fields.length; i++)
		{
			Field field = fields[i];
			Id pk = field.getAnnotation(Id.class);
			Column column = field.getAnnotation(Column.class);
			// if (null != pk)
			// {
			// Long id = getSequenceLongValue();
			// insert.append(field.getName());
			// insert.append(",");
			// values.append(id);
			// values.append(",");
			// DaoUtil.setFieldValue(this.getClassType(), instance, id);
			// }
			
			if (null != column && null == pk)
			{
				Object value = DaoUtil.getFieldValue(this.getClassType(), instance, field);
				if (null != value)
				{
					insert.append(column.name());
					insert.append(",");
					if (field.getType().equals(String.class))
					{
						values.append("'");
						values.append(value);
						values.append("'");
						values.append(",");
					}
					else if (field.getType().equals(Date.class))
					{
						Date date = (Date) value;
						values.append("'");
						values.append(DateUtil.formatDate(date, "yyyy-MM-dd HH:mm:ss"));
						values.append("'");
						values.append(",");
					}
					else
					{
						values.append(value);
						values.append(",");
					}
				}
			}
		}
		final String sql = insert.toString().substring(0, insert.length() - 1) + ") " + values.toString().substring(0, values.length() - 1) + ")";
		logger.info(sql);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		int n = 0;
		try
		{
			n = this.getJdbcTemplate().update(new PreparedStatementCreator()
			{
				@Override
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException
				{
					PreparedStatement ps = conn.prepareStatement(sql);
					return ps;
				}
			}, keyHolder);
			// this.getJdbcTemplate().update(sql);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		logger.info(logTime.end());
		if (n > 0)
		{
			Long id = keyHolder.getKey().longValue();
			DaoUtil.setFieldValue(this.getClassType(), instance, id);
			return instance;
		}
		return null;
	}
	
	public T update(T instance)
	{
		LogTime logTime = new LogTime();
		logTime.begin();
		StringBuffer update = new StringBuffer();
		update.append("update ");
		update.append(DaoUtil.getTableName(this.getClassType()));
		update.append(" set ");
		Field pkField = DaoUtil.getPkField(this.getClassType());
		String pkName = pkField.getName();
		Object id = DaoUtil.getFieldValue(this.getClassType(), instance, pkField);
		Field[] fields = this.getClassType().getDeclaredFields();
		for (int i = 0; i < fields.length; i++)
		{
			Field field = fields[i];
			Id pk = field.getAnnotation(Id.class);
			Column column = field.getAnnotation(Column.class);
			if (null != column && null == pk)
			{
				Object value = DaoUtil.getFieldValue(this.getClassType(), instance, field);
				if (null != value)
				{
					update.append(column.name());
					update.append("=");
					if (field.getType().equals(String.class))
					{
						update.append("'");
						update.append(value);
						update.append("'");
						update.append(",");
					}
					else if (field.getType().equals(Date.class))
					{
						Date date = (Date) value;
						update.append("'");
						update.append(DateUtil.formatDate(date, "yyyy-MM-dd HH:mm:ss"));
						update.append("'");
						update.append(",");
					}
					else
					{
						update.append(value);
						update.append(",");
					}
				}
			}
		}
		String sql = update.toString().substring(0, update.length() - 1) + " where " + pkName + " = ?";
		logger.info(sql);
		this.getJdbcTemplate().update(sql, new Object[]{id});
		logger.info(logTime.end());
		return instance;
	}
	
	public void delById(PK id)
	{
		LogTime logTime = new LogTime();
		logTime.begin();
		StringBuffer delete = new StringBuffer();
		delete.append("delete from ");
		delete.append(DaoUtil.getTableName(this.getClassType()));
		Field pkField = DaoUtil.getPkField(this.getClassType());
		String pkName = pkField.getName();
		delete.append(" where ");
		delete.append(pkName);
		delete.append(" = ?");
		String sql = delete.toString();
		logger.info(sql);
		this.getJdbcTemplate().update(sql, new Object[]{id});
		logger.info(logTime.end());
	}
	
	public void delByIds(PK[] ids)
	{
		if (ids == null || ids.length < 1)
			return;
		LogTime logTime = new LogTime();
		logTime.begin();
		StringBuffer delete = new StringBuffer();
		delete.append("delete from ");
		delete.append(DaoUtil.getTableName(this.getClassType()));
		Field pkField = DaoUtil.getPkField(this.getClassType());
		String pkName = pkField.getName();
		delete.append(" where ");
		delete.append(pkName);
		delete.append(" in ");
		delete.append("(");
		for (int i = 0; i < ids.length; i++)
		{
			delete.append("?");
			if (i < ids.length - 1)
			{
				delete.append(",");
			}
		}
		delete.append(")");
		String sql = delete.toString();
		logger.info(sql);
		this.getJdbcTemplate().update(sql, ids, new Long[]{});
		logger.info(logTime.end());
	}
	
	public T findById(PK id)
	{
		LogTime logTime = new LogTime();
		logTime.begin();
		StringBuffer select = new StringBuffer();
		select.append("select * from ");
		select.append(DaoUtil.getTableName(this.getClassType()));
		Field pkField = DaoUtil.getPkField(this.getClassType());
		String pkName = pkField.getName();
		select.append(" where ");
		select.append(pkName);
		select.append(" = ?");
		String sql = select.toString();
		logger.info(sql);
		List<T> list = this.getJdbcTemplate().query(sql, new Object[]{id}, new EntityRowMapper<T>(this.getClassType()));
		logger.info(logTime.end());
		if (null != list && list.size() > 0)
			return list.get(0);
		return null;
	}
	
	public List<T> findAll()
	{
		LogTime logTime = new LogTime();
		logTime.begin();
		StringBuffer select = new StringBuffer();
		select.append("select * from ");
		select.append(DaoUtil.getTableName(this.getClassType()));
		String sql = select.toString();
		logger.info(sql);
		List<T> list = this.getJdbcTemplate().query(sql, new EntityRowMapper<T>(this.getClassType()));
		logger.info(logTime.end());
		return list;
	}
	
	public static void main(String[] args)
	{
		LogTime logTime = new LogTime();
		logTime.begin();
		Field[] fields = SysUser.class.getDeclaredFields();
		for (Field field : fields)
		{
			Id pk = field.getAnnotation(Id.class);
			System.out.println(field.getName() + pk);
		}
		System.out.println(logTime.end());
		
	}
}