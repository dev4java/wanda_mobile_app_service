
package iMobile.security;

import iMobile.bean.SysAuthority;
import iMobile.bean.SysRole;
import iMobile.bean.SysUser;
import iMobile.manager.SysAuthorityService;
import iMobile.manager.SysRoleService;
import iMobile.manager.SysUserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService
{
	
	@Autowired
	private SysUserService		sysUserService;
	
	@Autowired
	private SysRoleService		sysRoleService;
	
	@Autowired
	private SysAuthorityService	sysAuthorityService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		SysUser sysUser = sysUserService.findByUsername(username);
		if (null == sysUser)
		{
			throw new UsernameNotFoundException("username is error");
		}
		String password = sysUser.getPassword();
		SysRole sysRole = sysRoleService.findById(sysUser.getRoleId());
		if (null == sysRole)
		{
			throw new UsernameNotFoundException("role is error");
		}
		List<SysAuthority> sysAuthoritieList = sysAuthorityService.findListByRoleId(sysRole.getId());
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (final SysAuthority sysAuthority : sysAuthoritieList)
		{
			authorities.add(new GrantedAuthority()
			{
				private static final long	serialVersionUID	= 4661808072904860060L;
				
				@Override
				public String getAuthority()
				{
					return sysAuthority.getName();
				}
			});
		}
		SecurityUser securityUser = new SecurityUser(username, password, authorities);
		return securityUser;
	}
}
