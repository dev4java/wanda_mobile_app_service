
package iMobile.manager;

import iMobile.bean.SysResource;
import iMobile.dao.SysResourceDao;
import iMobile.manager.base.AbstractService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysResourceService extends AbstractService<SysResource, Long>
{
	
	private SysResourceDao	sysResourceDao;
	
	@Autowired
	public void setSysResourceDao(SysResourceDao sysResourceDao)
	{
		this.sysResourceDao = sysResourceDao;
		this.setCommonDao(sysResourceDao);
	}
	
	public List<SysResource> findListByPid(Long pid)
	{
		return this.sysResourceDao.findListByPid(pid);
	}
	
	public List<SysResource> findListByAuthorityId(Long authorityId)
	{
		return this.sysResourceDao.findListByAuthorityId(authorityId);
	}
}
