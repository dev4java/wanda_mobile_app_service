package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.AppModuleType;

@Repository
public class AppModuleTypeDao extends AbstractDao<AppModuleType, Long>
{

	@Override
	protected Class<AppModuleType> getClassType()
	{
		return AppModuleType.class;
	}	
}
