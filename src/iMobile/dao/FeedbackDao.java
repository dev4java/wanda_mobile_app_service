package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.Feedback;

@Repository
public class FeedbackDao extends AbstractDao<Feedback, Long>
{

	@Override
	protected Class<Feedback> getClassType()
	{
		return Feedback.class;
	}	
}
