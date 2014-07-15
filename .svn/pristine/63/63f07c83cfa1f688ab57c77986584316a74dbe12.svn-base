
package iMobile.dao.base;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EntityRowMapper<T> implements RowMapper<T>
{
	private Class<T>	clazz;
	
	public EntityRowMapper(Class<T> clazz)
	{
		this.clazz = clazz;
	}
	
	@Override
	public T mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		try
		{
			T instance = clazz.newInstance();
			DaoUtil.setFieldValue(clazz, instance, rs);
			return instance;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
