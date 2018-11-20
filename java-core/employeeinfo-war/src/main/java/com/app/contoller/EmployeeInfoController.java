package com.app.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.EmployeeBean;
import com.app.emp.servce.EmployeeServce;
import com.app.emp.servce.pojo.EmployeeBeanServce;

@Controller
public class EmployeeInfoController {
	@Autowired
	EmployeeServce empBeanServce;
@RequestMapping(value="/send",method=RequestMethod.POST)	
public ModelAndView handleRequest(@ModelAttribute EmployeeBean empBean)
{ 
	System.out.println(empBean);
	EmployeeBeanServce empbeanService=new EmployeeBeanServce();
	empbeanService.setEmpId(empBean.getEmpId());
	empbeanService.setFirst_Name(empBean.getFirst_name());
	empbeanService.setLast_Name(empBean.getLast_name());
	empbeanService.setAddress(empBean.getAddress());
	String insertEmployee = empBeanServce.insertEmployee(empbeanService);
	System.out.println(insertEmployee);
	ModelAndView modelAndView= new ModelAndView("success","status",insertEmployee);
	
	return modelAndView;
	
}
}
