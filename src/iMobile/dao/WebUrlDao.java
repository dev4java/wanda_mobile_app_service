package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.WebUrl;

@Repository
public class WebUrlDao extends AbstractDao<WebUrl, Long>
{

	@Override
	protected Class<WebUrl> getClassType()
	{
		return WebUrl.class;
	}	
}
