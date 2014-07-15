
package iMobile.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class AccessDecisionManager implements org.springframework.security.access.AccessDecisionManager
{
	
	@Override
	public void decide(Authentication authentication, Object obj, Collection<ConfigAttribute> cas) throws AccessDeniedException, InsufficientAuthenticationException
	{
		System.out.println("decide");
		if (null != cas && cas.size() > 0)
		{
			for (ConfigAttribute configAttribute : cas)
			{
				String roleName = configAttribute.getAttribute();
				List<? extends GrantedAuthority> gaList = (List<? extends GrantedAuthority>) authentication.getAuthorities();
				for (GrantedAuthority ga : gaList)
				{
					if (ga.getAuthority().equals(roleName))
					{
						return;
					}
				}
			}
		}
		throw new AccessDeniedException("no right");
	}
	
	@Override
	public boolean supports(ConfigAttribute ca)
	{
		return true;
	}
	
	@Override
	public boolean supports(Class<?> clazz)
	{
		return true;
	}
}
