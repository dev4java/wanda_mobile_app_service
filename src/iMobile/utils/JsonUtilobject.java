package iMobile.utils;


import iMobile.bean.beas.successErrer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

      
    public class JsonUtilobject {  
    	
    	
    public JsonUtilobject(){}
      
    	
    	
    	public  static void JsonUtilsucceed(HttpServletRequest request, HttpServletResponse response) throws Exception
    	{
    		try
    		{
    			Gson gson = new Gson();
    			response.setContentType("application/json; charset=UTF-8");
    			successErrer  successErrer=new  successErrer(0,"执行成功");
				response.getWriter().write(gson.toJson(successErrer));
				System.out.println(gson.toJson(successErrer));
				System.out.println("-------------------------");
    		}
    		catch (Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    	
    	
    	public  static void JsonUtilsucceedobject(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception
    	{
    		try
    		{
    			Gson gson = new Gson();
    			response.setContentType("application/json; charset=UTF-8");
				response.getWriter().write(gson.toJson(obj));
				System.out.println(gson.toJson(obj));
				System.out.println("-------------------------");
    		}
    		catch (Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    	
    	
    	
    	public static void JsonUtilsuccessErrer(HttpServletRequest request, HttpServletResponse response) throws Exception
    	{
    		try
    		{
    			Gson gson = new Gson();
    			response.setContentType("application/json; charset=UTF-8");
    			successErrer  successErrer=new  successErrer(1,"执行失败");
				response.getWriter().write(gson.toJson(successErrer));
				System.out.println(gson.toJson(successErrer));
				System.out.println("-------------------------");
    		}
    		catch (Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    	
    	
        
      //取当前服务器的毫秒数据
     public static Long getSyscurrentTimeMillis(){
       	 Long id = System.currentTimeMillis(); //取时间毫秒数
       	 return id;
      
   	}
    	
    
    }  