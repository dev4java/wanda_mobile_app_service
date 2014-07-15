package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.news;

@Repository
public class newsDao extends AbstractDao<news, Long>
{

	@Override
	protected Class<news> getClassType()
	{
		return news.class;
	}	
}
