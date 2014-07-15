
package iMobile.manager;

import iMobile.bean.SysUser;
import iMobile.dao.base.AbstractDao;
import iMobile.dao.base.EntityRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public class SysUserManager extends AbstractDao<SysUser, Long>
{
	
	@Override
	protected Class<SysUser> getClassType()
	{
		return SysUser.class;
	}
	
	public SysUser findByUsername(final String username)
	{
		final SysUser sysUser = new SysUser();
		String sql = "select id, password, role_id from " + this.getTableName() + " where username = ?";
		this.getJdbcTemplate().query(sql, new Object[] { username }, new RowCallbackHandler()
		{
			@Override
			public void processRow(ResultSet rs) throws SQLException
			{
				sysUser.setId(rs.getLong("id"));
				sysUser.setUsername(username);
				sysUser.setPassword(rs.getString("password"));
				sysUser.setRoleId(rs.getLong("role_id"));
			}
		});
		return sysUser;
	}

	public SysUser findByUsernamea(final String username)
	{
		final SysUser sysUser = new SysUser();
		String sql = "select id, password, role_id from " + this.getTableName() + " where username = ?";
		this.getJdbcTemplate().query(sql, new Object[] { username }, new EntityRowMapper<SysUser>(this.getClassType()));
		return sysUser;
	}
}
