package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.ApprDetail;

@Repository
public class ApprDetailDao extends AbstractDao<ApprDetail, Long>
{

	@Override
	protected Class<ApprDetail> getClassType()
	{
		return ApprDetail.class;
	}	
}
