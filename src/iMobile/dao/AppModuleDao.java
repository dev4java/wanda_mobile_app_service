package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.AppModule;

@Repository
public class AppModuleDao extends AbstractDao<AppModule, Long>
{

	@Override
	protected Class<AppModule> getClassType()
	{
		return AppModule.class;
	}	
}
