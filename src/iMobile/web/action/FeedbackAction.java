package iMobile.web.action;

import iMobile.entity.Feedback;
import iMobile.manager.FeedbackManager;
import iMobile.utils.JsonUtilobject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FeedbackAction {

	@Autowired
	private FeedbackManager feedbackManager;
	@RequestMapping(value = "/h/addfeedback", method = RequestMethod.POST)
	public void addFeerBack(String userid,String email,String content,String devicetype,HttpServletRequest request,HttpServletResponse response){
		try {
			Feedback feedback = new Feedback();
			feedback.setContent(content);
			feedback.setDevicetype(Integer.parseInt(devicetype));
			feedback.setEmail(email);
			feedback.setEmployeeID(userid);
			feedbackManager.saveFeedback(feedback);
			JsonUtilobject.JsonUtilsucceed(request, response);
		} catch (Exception e) {
			try {
				JsonUtilobject.JsonUtilsuccessErrer(request, response);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
