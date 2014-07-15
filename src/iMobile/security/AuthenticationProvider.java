
package iMobile.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PlaintextPasswordEncoder;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthenticationProvider extends AbstractUserDetailsAuthenticationProvider
{
	
	@Autowired
	private UserDetailsService	userDetailsService;
	
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken token) throws AuthenticationException
	{
		// �ж��Ƿ���ڵ�½�û�
		if (token.getCredentials() == null)
		{
			logger.debug("Authentication failed: no credentials provided");
		}
		String presentedPassword = token.getCredentials().toString();
		// ///����MD5����
		presentedPassword = new Md5PasswordEncoder().encodePassword(presentedPassword, userDetails.getUsername());
		// �ȶ������Ƿ�һ��
		if (!new PlaintextPasswordEncoder().isPasswordValid(userDetails.getPassword(), presentedPassword, null))
		{
			logger.debug("Authentication failed: password does not match stored value");
		}
	}
	
	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken token) throws AuthenticationException
	{
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		return userDetails;
	}
	
}
