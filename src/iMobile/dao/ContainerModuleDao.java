package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.ContainerModule;

@Repository
public class ContainerModuleDao extends AbstractDao<ContainerModule, Long>
{

	@Override
	protected Class<ContainerModule> getClassType()
	{
		return ContainerModule.class;
	}	
}
