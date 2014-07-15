package iMobile.web.action;

import iMobile.bean.beas.ListObjectChar;
import iMobile.entity.appclient;
import iMobile.manager.appclientManager;
import iMobile.utils.JsonUtilobject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppClientAction {

	@Autowired
	private appclientManager appclientManager;
	@RequestMapping(value = "/h/checkversion", method = RequestMethod.POST)
	public void checkVersion(String userid,String version,String devicetype,HttpServletResponse response,HttpServletRequest request){
		
		try {
			appclient appclient = new appclient();
			appclient.setLastversion("2.2");
			appclient.setUrl("http://www.baidu.com");
			ListObjectChar objectChar = new ListObjectChar();
			//objectChar.setResult(new MssChar(0, "成功"));
			JsonUtilobject.JsonUtilsucceed(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
