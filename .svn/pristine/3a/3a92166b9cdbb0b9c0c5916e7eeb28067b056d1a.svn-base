
package iMobile.security;

import iMobile.utils.Constant;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

public class AuthenticationFilter extends AbstractAuthenticationProcessingFilter
{
	
	protected Log				logger								= LogFactory.getLog(AuthenticationFilter.class);
	
	public static final String	SPRING_SECURITY_FORM_USERNAME_KEY	= "username";										// ��¼��
																														
	public static final String	SPRING_SECURITY_FORM_PASSWORD_KEY	= "password";										// ��¼����
																														
	public static final String	SPRING_SECURITY_FORM_VERIFYCODE_KEY	= "verifyCode";									// ��֤��
																														
	public static String		loginMessage						= "";
	
	public AuthenticationFilter(String filterProcessesUrl)
	{
		super(filterProcessesUrl);
	}
	
	public AuthenticationFilter()
	{
		super("/doLogin/");
	}
	
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException
	{
		String username = this.getUsername(request);
		String password = this.getPassword(request);
		String verifyCode = this.getVerifyCode(request);
		String validateCode = this.getValidateCode(request);
		if (StringUtils.isBlank(verifyCode) || StringUtils.isBlank(validateCode))
		{
			loginMessage = "����д��֤��";
			username = "";
		}
		else if (!verifyCode.equalsIgnoreCase(validateCode))
		{
			loginMessage = "��֤�벻��ȷ";
			username = "";
		}
		else if (StringUtils.isBlank(username))
		{
			loginMessage = "�û�����Ϊ��";
		}
		else if (StringUtils.isBlank(password))
		{
			loginMessage = "���벻��Ϊ��";
		}
		removeValidateCode(request);
		UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
		Authentication authentication = this.getAuthenticationManager().authenticate(authRequest);
		return authentication;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, Authentication authResult) throws IOException, ServletException
	{
		logger.info("��¼�ɹ�");
		super.successfulAuthentication(request, response, authResult);
	}
	
	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException
	{
		logger.info("��¼ʧ��");
		if (StringUtils.isBlank(loginMessage))
		{
			loginMessage = "�û�������벻��ȷ��";
		}
		request.getSession(false).setAttribute("loginMessage", loginMessage);
		super.unsuccessfulAuthentication(request, response, failed);
	}
	
	public String getUsername(HttpServletRequest request)
	{
		return request.getParameter(SPRING_SECURITY_FORM_USERNAME_KEY);
	}
	
	public String getPassword(HttpServletRequest request)
	{
		return request.getParameter(SPRING_SECURITY_FORM_PASSWORD_KEY);
	}
	
	public String getVerifyCode(HttpServletRequest request)
	{
		return request.getParameter(SPRING_SECURITY_FORM_VERIFYCODE_KEY);
	}
	
	public String getValidateCode(HttpServletRequest request)
	{
		Object obj = request.getSession().getAttribute(Constant.LOGIN_FORM_SESSION_VALIDATE_CODE_KEY);
		if (null != obj)
		{
			return obj.toString();
		}
		return null;
	}
	
	public void removeValidateCode(HttpServletRequest request)
	{
		request.getSession().removeAttribute(Constant.LOGIN_FORM_SESSION_VALIDATE_CODE_KEY);
	}
}
