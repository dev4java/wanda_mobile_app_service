package iMobile.dao;

import org.springframework.stereotype.Repository;

import iMobile.dao.base.AbstractDao;
import iMobile.entity.t_employee;

@Repository
public class t_employeeDao extends AbstractDao<t_employee, Long>
{

	@Override
	protected Class<t_employee> getClassType()
	{
		return t_employee.class;
	}	
}
