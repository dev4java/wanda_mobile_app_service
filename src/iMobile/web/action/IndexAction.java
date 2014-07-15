
package iMobile.web.action;

import iMobile.bean.SysUser;
import iMobile.manager.SysUserService;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction
{
	@Autowired
	private SysUserService	sysUserService;
	
	@RequestMapping(value = "/index.do")
	public String index()
	{
		/*SysUser user = new SysUser();
		user.setUsername("wangshuai");
		user.setPassword("wangshuaipwd");
		user.setCreateTime(new Date());
		try
		{
			user = sysUserService.save(user);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(user.getId());
		SysUser sysUser = sysUserService.findById(user.getId());
		sysUser.setUsername("wangshuaiup");
		try
		{
			sysUserService.update(sysUser);
			sysUserService.findAll();
			sysUserService.delById(14l);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		List<SysUser> list = sysUserService.findAll();
		for (SysUser s : list)
		{
			System.out.println(s.getUsername());
		}
		model.addAttribute("user", user);
		*/
		return "forward:/index.jsp";
	}
	
	
	@RequestMapping(value = "/con/a.do")
	public String usercon(String pwd, Model model, HttpServletRequest request, HttpServletResponse response)
	{
		SysUser user = new SysUser();
		user.setUsername("wangshuai");
		user.setPassword("wangshuaipwd");
		user.setCreateTime(new Date());
		try
		{
			user = sysUserService.save(user);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(user.getId());
		SysUser sysUser = sysUserService.findById(user.getId());
		sysUser.setUsername("wangshuaiup");
		try
		{
			sysUserService.update(sysUser);
			sysUserService.findAll();
			sysUserService.delById(14l);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		List<SysUser> list = sysUserService.findAll();
		for (SysUser s : list)
		{
			System.out.println(s.getUsername());
		}
		model.addAttribute("user", user);
		return "forward:/index.jsp";
	}
	
	@RequestMapping(value = "/file/upload.do")
	public String upload(Model model, HttpServletRequest request, HttpServletResponse response)
	{
		return null;
	}
	
}
