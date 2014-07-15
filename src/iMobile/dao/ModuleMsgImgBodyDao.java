package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.ModuleMsgImgBody;

@Repository
public class ModuleMsgImgBodyDao extends AbstractDao<ModuleMsgImgBody, Long>
{

	@Override
	protected Class<ModuleMsgImgBody> getClassType()
	{
		return ModuleMsgImgBody.class;
	}	
}
