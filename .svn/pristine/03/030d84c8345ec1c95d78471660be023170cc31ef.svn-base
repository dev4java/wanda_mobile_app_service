
package iMobile.web.servlet;

import iMobile.bean.SysResource;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class InitConstantObjects extends HttpServlet
{
	
	private static final long							serialVersionUID	= -7502932926807228871L;
	
	public static List<SysResource>						SYS_RESOURCES_PLIST;
	
	public static Map<String, List<ConfigAttribute>>	RESOURCES_MAP;
	
	public InitConstantObjects()
	{
		super();
	}
	
	public void destroy()
	{
		super.destroy();
	}
	
	private void out(HttpServletResponse response, String msg) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("ok");
		out.flush();
		out.close();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String init = request.getParameter("init");
		if ("ok".equals(init))
		{
			initContext();
			out(response, "ok");
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("");
		out.flush();
		out.close();
	}
	
	public void init() throws ServletException
	{
		// autoConnectionAdmin = (new Boolean(getInitParameter("autoConnectionAdmin"))).booleanValue();
		initContext();
	}
	
	private void initContext()
	{
		WebApplicationContext wc = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		initSysResource(wc);
		initResourceMap(wc);
	}
	
	private void initSysResource(WebApplicationContext wc)
	{
//		SysResourceService sysResourceService = wc.getBean("sysResourceService", SysResourceService.class);
//		InitConstantObjects.SYS_RESOURCES_PLIST = sysResourceService.findListByPid(null);
	}
	
	private void initResourceMap(WebApplicationContext wc)
	{
//		SysAuthorityService sysAuthorityService = wc.getBean("sysAuthorityService", SysAuthorityService.class);
//		SysResourceService sysResourceService = wc.getBean("sysResourceService", SysResourceService.class);
//		
//		List<SysAuthority> authorities = sysAuthorityService.findAll();
//		RESOURCES_MAP = new HashMap<String, List<ConfigAttribute>>();
//		for (SysAuthority auth : authorities)
//		{
//			ConfigAttribute ca = new SecurityConfig(auth.getName());// "ROLE_ADMIN"
//			List<SysResource> resources = sysResourceService.findListByAuthorityId(auth.getId());
//			for (SysResource res : resources)
//			{
//				List<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
//				if (StringUtils.isBlank(res.getUrl()))
//					continue;
//				String url = res.getUrl().trim();
//				if (RESOURCES_MAP.containsKey(url))
//				{
//					List<ConfigAttribute> value = RESOURCES_MAP.get(url);
//					value.add(ca);
//					RESOURCES_MAP.put(url, value);
//					// "log.jsp","role_user,role_admin"
//				}
//				else
//				{
//					atts.add(ca);
//					RESOURCES_MAP.put(url, atts);
//				}
//			}
//		}
	}
}
