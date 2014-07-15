package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.Config;

@Repository
public class ConfigDao extends AbstractDao<Config, Long>
{

	@Override
	protected Class<Config> getClassType()
	{
		return Config.class;
	}	
}
