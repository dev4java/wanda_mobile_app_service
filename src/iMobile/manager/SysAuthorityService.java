
package iMobile.manager;

import iMobile.bean.SysAuthority;
import iMobile.dao.SysAuthorityDao;
import iMobile.manager.base.AbstractService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAuthorityService extends AbstractService<SysAuthority, Long>
{
	
	private SysAuthorityDao	sysAuthorityDao;
	
	@Autowired
	public void setSysAuthorityDao(SysAuthorityDao sysAuthorityDao)
	{
		this.sysAuthorityDao = sysAuthorityDao;
		this.setCommonDao(sysAuthorityDao);
	}
	
	public List<SysAuthority> findListByRoleId(Long roleId)
	{
		return this.sysAuthorityDao.findListByRoleId(roleId);
	}
}
