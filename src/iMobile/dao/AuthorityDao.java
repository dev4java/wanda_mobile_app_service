package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.Authority;

@Repository
public class AuthorityDao extends AbstractDao<Authority, Long>
{

	@Override
	protected Class<Authority> getClassType()
	{
		return Authority.class;
	}	
}
