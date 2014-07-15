
package iMobile.dao;

import iMobile.bean.SysRole;
import iMobile.dao.base.AbstractDao;

import org.springframework.stereotype.Repository;

@Repository
public class SysRoleDao extends AbstractDao<SysRole, Long>
{
	
	@Override
	protected Class<SysRole> getClassType()
	{
		return SysRole.class;
	}
	
}
