package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.AuthUser;

@Repository
public class AuthUserDao extends AbstractDao<AuthUser, Long>
{

	@Override
	protected Class<AuthUser> getClassType()
	{
		return AuthUser.class;
	}	
}
