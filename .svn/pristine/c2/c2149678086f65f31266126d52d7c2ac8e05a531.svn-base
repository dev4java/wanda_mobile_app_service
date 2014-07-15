
package iMobile.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;

public class SecurityInterceptor extends AbstractSecurityInterceptor implements Filter
{
	@Autowired
	private FilterInvocationSecurityMetadataSource	securityMetadataSource;
	
	@Override
	public Class<?> getSecureObjectClass()
	{
		return FilterInvocation.class;
	}
	
	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource()
	{
		return securityMetadataSource;
	}
	
	@Override
	public void destroy()
	{	
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		if (!(request instanceof HttpServletRequest))
		{
			chain.doFilter(request, response);
			return;
		}
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		if (httpRequest.isRequestedSessionIdFromURL())
		{
			HttpSession session = httpRequest.getSession();
			if (session != null)
				session.invalidate();
		}
		@SuppressWarnings("unused")
		HttpServletResponseWrapper wrappedResponse = new HttpServletResponseWrapper(httpResponse)
		{
			public String encodeRedirectUrl(String url)
			{
				return url;
			}
			
			public String encodeRedirectURL(String url)
			{
				return url;
			}
			
			public String encodeUrl(String url)
			{
				return url;
			}
			
			public String encodeURL(String url)
			{
				return url;
			}
		};
		FilterInvocation fi = new FilterInvocation(request, response, chain);
		invoke(fi);
	}
	
	@Override
	public void init(FilterConfig fc) throws ServletException
	{	
		
	}
	
	public void invoke(FilterInvocation fi) throws IOException, ServletException
	{
		InterceptorStatusToken token = super.beforeInvocation(fi);
		try
		{
			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
		}
		finally
		{
			super.afterInvocation(token, null);
		}
	}
}
