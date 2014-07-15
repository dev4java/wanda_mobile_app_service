
package iMobile.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUser implements UserDetails, Serializable
{
	
	private static final long		serialVersionUID		= -7626510151630973266L;
	
	private List<GrantedAuthority>	authorities;
	
	private String					username;
	
	private String					password;
	
	private boolean					accountNonExpired		= true;
	
	private boolean					accountNonLocked		= true;
	
	private boolean					credentialsNonExpired	= true;
	
	private boolean					enabled					= true;
	
	public SecurityUser(String username, String password, List<GrantedAuthority> authorities)
	{
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}
	
	public SecurityUser(String username, String password, List<GrantedAuthority> authorities, boolean accountNonExpired, boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled)
	{
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonExpired = credentialsNonExpired;
		this.enabled = enabled;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		return this.authorities;
	}
	
	@Override
	public String getPassword()
	{
		return this.password;
	}
	
	@Override
	public String getUsername()
	{
		return this.username;
	}
	
	@Override
	public boolean isAccountNonExpired()
	{
		return this.accountNonExpired;
	}
	
	@Override
	public boolean isAccountNonLocked()
	{
		return this.accountNonLocked;
	}
	
	@Override
	public boolean isCredentialsNonExpired()
	{
		return this.credentialsNonExpired;
	}
	
	@Override
	public boolean isEnabled()
	{
		return this.enabled;
	}
	
}
