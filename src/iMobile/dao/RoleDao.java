package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.Role;

@Repository
public class RoleDao extends AbstractDao<Role, Long>
{

	@Override
	protected Class<Role> getClassType()
	{
		return Role.class;
	}	
}
