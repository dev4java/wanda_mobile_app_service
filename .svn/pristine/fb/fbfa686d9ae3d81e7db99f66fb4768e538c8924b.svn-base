
package iMobile.dao.base;

import java.io.Serializable;
import java.util.List;

public interface CommonDao<T, PK extends Serializable>
{
	public T save(T instance);
	
	public T update(T instance);
	
	public void delById(PK id);
	
	public void delByIds(PK[] ids);
	
	public T findById(PK id);
	
	public List<T> findAll();
}