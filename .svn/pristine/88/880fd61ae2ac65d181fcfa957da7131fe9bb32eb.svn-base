
package iMobile.dao;

import iMobile.bean.SysAuthority;
import iMobile.dao.base.AbstractDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public class SysAuthorityDao extends AbstractDao<SysAuthority, Long>
{
	
	@Override
	protected Class<SysAuthority> getClassType()
	{
		return SysAuthority.class;
	}
	
	public List<SysAuthority> findListByRoleId(Long roleId)
	{
		final List<SysAuthority> sysAuthoritys = new ArrayList<SysAuthority>();
		String sql = "select t.id,t.name from tb_sysauthority t left join tb_sys_role_auh ra on ra.auh_id = t.id left join tb_sysrole r on ra.role_id = r.id where r.id = ?";
		this.getJdbcTemplate().query(sql, new Object[] { roleId }, new RowCallbackHandler()
		{
			@Override
			public void processRow(ResultSet rs) throws SQLException
			{
				SysAuthority sysAuthority = new SysAuthority();
				sysAuthority.setId(rs.getLong("id"));
				sysAuthority.setName(rs.getString("name"));
				sysAuthoritys.add(sysAuthority);
			}
		});
		return sysAuthoritys;
	}
}
