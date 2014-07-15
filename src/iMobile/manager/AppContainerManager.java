package iMobile.manager;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.AppContainer;

@Repository
public class AppContainerManager extends AbstractDao<AppContainer, Long>
{

	@Override
	protected Class<AppContainer> getClassType()
	{
		return AppContainer.class;
	}	
}
