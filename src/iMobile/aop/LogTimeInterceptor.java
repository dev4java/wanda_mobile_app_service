
package iMobile.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogTimeInterceptor
{
	@Pointcut("execution(public * com.aries.dao.SysUserDao.*(..))")
	public void before()
	{}
	
	@Before("before()")
	public void begin()
	{
		
		System.out.println("begin");
	}
	
	// @After("execution(@LogTime * **.*())")
	@After("before()")
	public void after()
	{
		System.out.println("end");
	}
}
