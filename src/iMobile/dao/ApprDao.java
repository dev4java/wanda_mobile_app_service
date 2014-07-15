package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.Appr;

@Repository
public class ApprDao extends AbstractDao<Appr, Long>
{

	@Override
	protected Class<Appr> getClassType()
	{
		return Appr.class;
	}	
}
