
package iMobile.manager;

import iMobile.bean.SysResource;
import iMobile.dao.base.AbstractDao;
import iMobile.dao.base.EntityRowMapper;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SysResourceManager extends AbstractDao<SysResource, Long>
{
	
	@Override
	protected Class<SysResource> getClassType()
	{
		return SysResource.class;
	}
	
	public List<SysResource> findListByPid(Long pid)
	{
		String sql = "select * from " + this.getTableName() + " where 1=1";
		if (null == pid)
		{
			sql += " and pid is null";
		}
		else
		{
			sql += " and pid = " + pid;
		}
		List<SysResource> list = this.getJdbcTemplate().query(sql, new Object[] {}, new EntityRowMapper<SysResource>(this.getClassType()));
		return list;
	}
	
	public List<SysResource> findListByAuthorityId(Long authorityId)
	{
		String sql = "select t.id,t.name,t.url from tb_sysresource t left join tb_sys_auh_res ar on ar.res_id = t.id left join tb_sysauthority a on ar.auh_id = a.id where a.id = ?";
		List<SysResource> list = this.getJdbcTemplate().query(sql, new Object[] { authorityId }, new EntityRowMapper<SysResource>(this.getClassType()));
		return list;
	}
}
