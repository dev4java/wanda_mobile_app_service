
package iMobile.manager;

import iMobile.bean.SysRole;
import iMobile.dao.base.AbstractDao;

import org.springframework.stereotype.Repository;

@Repository
public class SysRoleManager extends AbstractDao<SysRole, Long>
{
	
	@Override
	protected Class<SysRole> getClassType()
	{
		return SysRole.class;
	}
	
}
