
package iMobile.manager;

import iMobile.bean.SysUser;
import iMobile.dao.SysUserDao;
import iMobile.manager.base.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService extends AbstractService<SysUser, Long>
{
	
	private SysUserDao	sysUserDao;
	
	@Autowired
	public void setSysUserDao(SysUserDao sysUserDao)
	{
		this.sysUserDao = sysUserDao;
		this.setCommonDao(sysUserDao);
	}
	
	public SysUser findByUsername(String username)
	{
		return this.sysUserDao.findByUsername(username);
	}
}
