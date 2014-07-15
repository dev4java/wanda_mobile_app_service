package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.PushQueue;

@Repository
public class PushMessageDao extends AbstractDao<PushQueue, Long>
{

	@Override
	protected Class<PushQueue> getClassType()
	{
		return PushQueue.class;
	}	
}
