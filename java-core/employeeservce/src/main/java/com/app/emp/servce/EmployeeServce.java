package com.app.emp.servce;

import com.app.emp.servce.pojo.EmployeeBeanServce;
import com.app.employee.dao.EmployeeDao;
import com.app.employee.dao.pojo.Employeeeinfo;

public class EmployeeServce {

	public String insertEmployee(EmployeeBeanServce empbeanService)
	{
		Employeeeinfo empnfo = new Employeeeinfo();
		empnfo.setEmpId(empbeanService.getEmpId());
		empnfo.setFirst_Name(empbeanService.getFirst_Name());
		empnfo.setLast_Name(empbeanService.getLast_Name());
		empnfo.setAddress(empbeanService.getAddress());
		EmployeeDao empdao=new EmployeeDao();
		String status = empdao.persistEmp(empnfo);
		return status;
		
	}
}
