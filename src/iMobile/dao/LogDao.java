package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.Log;

@Repository
public class LogDao extends AbstractDao<Log, Long>
{

	@Override
	protected Class<Log> getClassType()
	{
		return Log.class;
	}	
}
