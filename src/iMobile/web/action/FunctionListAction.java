
package iMobile.web.action;

import iMobile.bean.BottomMenu;
import iMobile.bean.Contents;
import iMobile.bean.FunctionList;
import iMobile.bean.ServerList;
import iMobile.bean.beas.ListObjectChar;
import iMobile.utils.JsonUtilobject;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FunctionListAction
{
	

	
	//功能列表
		@RequestMapping(value = "/h/queryfunctionList", method = RequestMethod.GET)
		public void queryfunctionList(HttpServletRequest request, HttpServletResponse response) throws Exception
		{
			try{
				List<FunctionList> list=new ArrayList<FunctionList>();
				FunctionList fun1=new FunctionList("1","新闻中心","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","http://www.baidu.com",2,1);
				FunctionList fun2=new FunctionList("2","视频中心","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","http://www.google.cn",2,2);
				FunctionList fun3=new FunctionList("3","企业内刊","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","http://www.baidu.com",3,3);
				FunctionList fun4=new FunctionList("4","应用推荐","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","http://www.baidu.com",2,4);
				FunctionList fun5=new FunctionList("5","媒体报道","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","http://www.baidu.com",2,5);
				FunctionList fun6=new FunctionList("6","万达义工","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","wdoapage://WDOfficeTabViewController",1,6);
				FunctionList fun7=new FunctionList("7","支柱产业","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","http://www.baidu.com",2,7);
				FunctionList fun8=new FunctionList("8","更多","http://img0.bdstatic.com/img/image/shouye/sywm-10986442615.jpg","http://www.baidu.com",2,8);
				list.add(fun1);
				list.add(fun2);
				list.add(fun3);
				list.add(fun4);
				list.add(fun5);
				list.add(fun6);
				list.add(fun7);
				list.add(fun8);
				
				if (list != null)
				{
					ListObjectChar objectchar = new ListObjectChar(0, "执行成功");
					objectchar.setData(list);
					JsonUtilobject.JsonUtilsucceedobject(request, response, objectchar);
				}
			}catch(Exception e){
				JsonUtilobject.JsonUtilsuccessErrer(request, response);
				e.printStackTrace();
			}
			
		}
		
		
		//服务号列表
				@RequestMapping(value = "/h/queryServerList", method = RequestMethod.GET)
				public void queryServerList(HttpServletRequest request, HttpServletResponse response) throws Exception
				{
					try{
						List<ServerList> list=new ArrayList<ServerList>();
						ServerList serv1=new ServerList("1","iconurl","serviceresid","servicename","briefintro",JsonUtilobject.getSyscurrentTimeMillis(),1);
						ServerList serv2=new ServerList("2","iconurl","serviceresid","servicename","briefintro",JsonUtilobject.getSyscurrentTimeMillis(),1);
						ServerList serv3=new ServerList("3","iconurl","serviceresid","servicename","briefintro",JsonUtilobject.getSyscurrentTimeMillis(),1);
						ServerList serv4=new ServerList("4","iconurl","serviceresid","servicename","briefintro",JsonUtilobject.getSyscurrentTimeMillis(),1);
						list.add(serv1);
						list.add(serv2);
						list.add(serv3);
						list.add(serv4);
						
						if (list != null)
						{
							ListObjectChar objectchar = new ListObjectChar(0, "执行成功");
							objectchar.setData(list);
							JsonUtilobject.JsonUtilsucceedobject(request, response, objectchar);
						}
					}catch(Exception e){
						JsonUtilobject.JsonUtilsuccessErrer(request, response);
						e.printStackTrace();
					}
					
				}
		
		
		//底栏菜单
				@RequestMapping(value = "/h/queryBottomMenu", method = RequestMethod.GET)
				public void queryBottomMenu(HttpServletRequest request, HttpServletResponse response) throws Exception
				{
					try{
						List<BottomMenu> desalist=new ArrayList<BottomMenu>();
						
						
						BottomMenu deasmenu1=new BottomMenu("1","serviceresid",1,"name","content","url",null);
						BottomMenu deasmenu2=new BottomMenu("1","serviceresid",1,"name","content","url",null);
						BottomMenu deasmenu3=new BottomMenu("1","serviceresid",1,"name","content","url",null);
						
						List<BottomMenu> list=new ArrayList<BottomMenu>();
						BottomMenu menu1=new BottomMenu("1","serviceresid",2,"name","content","url",null);
						BottomMenu menu2=new BottomMenu("2","serviceresid",2,"name","content","url",null);
						BottomMenu menu3=new BottomMenu("3","serviceresid",2,"name","content","url",null);
						BottomMenu menu4=new BottomMenu("4","serviceresid",2,"name","content","url",null);
						BottomMenu menu5=new BottomMenu("5","serviceresid",2,"name","content","url",null);
						list.add(menu1);
						list.add(menu2);
						list.add(menu3);
						list.add(menu4);
						list.add(menu5);
						
						
						deasmenu1.setSubmenus(list);
						deasmenu2.setSubmenus(list);
						deasmenu3.setSubmenus(list);
						
						desalist.add(deasmenu1);
						desalist.add(deasmenu2);
						desalist.add(deasmenu3);
						
						
						if (desalist != null)
						{
							ListObjectChar objectchar = new ListObjectChar(0, "执行成功");
							objectchar.setData(desalist);
							JsonUtilobject.JsonUtilsucceedobject(request, response, objectchar);
						}
					}catch(Exception e){
						JsonUtilobject.JsonUtilsuccessErrer(request, response);
						e.printStackTrace();
					}
					
				}
				
	 //内容列表
				@RequestMapping(value = "/h/queryContentsList", method = RequestMethod.GET)
				public void queryContentsList(HttpServletRequest request, HttpServletResponse response) throws Exception
				{
					try{
						List<Contents> list=new ArrayList<Contents>();
						Contents con1=new Contents("1",1,"picurl","url","content",JsonUtilobject.getSyscurrentTimeMillis(),"title","briefintro");
						Contents con2=new Contents("2",1,"picurl","url","content",JsonUtilobject.getSyscurrentTimeMillis(),"title","briefintro");
						Contents con3=new Contents("3",1,"picurl","url","content",JsonUtilobject.getSyscurrentTimeMillis(),"title","briefintro");
						Contents con4=new Contents("4",1,"picurl","url","content",JsonUtilobject.getSyscurrentTimeMillis(),"title","briefintro");
						list.add(con1);
						list.add(con2);
						list.add(con3);
						list.add(con4);
						
						if (list != null)
						{
							ListObjectChar objectchar = new ListObjectChar(0, "执行成功");
							objectchar.setData(list);
							JsonUtilobject.JsonUtilsucceedobject(request, response, objectchar);
						}
					}catch(Exception e){
						JsonUtilobject.JsonUtilsuccessErrer(request, response);
						e.printStackTrace();
					}
					
				}
		
	

}
