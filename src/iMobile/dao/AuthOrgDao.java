package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.AuthOrg;

@Repository
public class AuthOrgDao extends AbstractDao<AuthOrg, Long>
{

	@Override
	protected Class<AuthOrg> getClassType()
	{
		return AuthOrg.class;
	}	
}
