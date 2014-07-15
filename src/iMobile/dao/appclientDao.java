package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.appclient;

@Repository
public class appclientDao extends AbstractDao<appclient, Long>
{

	@Override
	protected Class<appclient> getClassType()
	{
		return appclient.class;
	}	
}
