
package iMobile.security;

import iMobile.web.servlet.InitConstantObjects;

import java.util.Collection;
import java.util.List;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.stereotype.Service;

@Service
public class FilterInvocationSecurityMetadataSource implements org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource
{
	
	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes()
	{
		return null;
	}
	
	@Override
	public Collection<ConfigAttribute> getAttributes(Object obj) throws IllegalArgumentException
	{
		String url = ((FilterInvocation) obj).getRequestUrl();
		//url = "/order/work.do";
		if (InitConstantObjects.RESOURCES_MAP.containsKey(url))
		{
			List<ConfigAttribute> list = InitConstantObjects.RESOURCES_MAP.get(url);
			return list;
		}
		return null;
	}
	
	@Override
	public boolean supports(Class<?> clazz)
	{
		return true;
	}
	
}
