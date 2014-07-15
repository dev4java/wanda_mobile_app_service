
package iMobile.manager.base;

import iMobile.dao.base.CommonDao;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public abstract class AbstractService<T, PK extends Serializable>
{
	protected Log				logger	= LogFactory.getLog(getClass());
	
	private CommonDao<T, PK>	commonDao;
	
	protected CommonDao<T, PK> getCommonDao()
	{
		return commonDao;
	}
	
	protected void setCommonDao(CommonDao<T, PK> commonDao)
	{
		this.commonDao = commonDao;
	}
	
	@Transactional(readOnly = false)
	public T save(T instance)
	{
		try
		{
			return getCommonDao().save(instance);
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}
		
	}
	
	@Transactional(readOnly = false)
	public T update(T instance)
	{
		return getCommonDao().update(instance);
	}
	
	@Transactional(readOnly = false)
	public void delById(PK id)
	{
		getCommonDao().delById(id);
	}
	
	@Transactional(readOnly = false)
	public void delByIds(PK[] ids)
	{
		try
		{
			getCommonDao().delByIds(ids);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public T findById(PK id)
	{
		return getCommonDao().findById(id);
	}
	
	public List<T> findAll()
	{
		return getCommonDao().findAll();
	}
}
