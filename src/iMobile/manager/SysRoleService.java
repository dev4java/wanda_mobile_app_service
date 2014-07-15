
package iMobile.manager;

import iMobile.bean.SysRole;
import iMobile.dao.SysRoleDao;
import iMobile.manager.base.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService extends AbstractService<SysRole, Long>
{
	
	private SysRoleDao	sysRoleDao;
	
	@Autowired
	public void setSysRoleDao(SysRoleDao sysRoleDao)
	{
		this.sysRoleDao = sysRoleDao;
		this.setCommonDao(sysRoleDao);
	}
	
	public SysRoleDao getSysRoleDao()
	{
		return this.sysRoleDao;
	}
}
