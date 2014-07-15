package iMobile.manager;

import iMobile.dao.FeedbackDao;
import iMobile.entity.Feedback;
import iMobile.manager.base.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class FeedbackManager extends AbstractService<Feedback, Long>
{
	@Autowired
	private FeedbackDao feedbackDao;

	@Transactional
	public void saveFeedback(Feedback feedback){
		feedbackDao.save(feedback);
	}
}
