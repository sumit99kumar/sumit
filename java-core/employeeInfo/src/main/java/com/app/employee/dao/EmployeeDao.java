package com.app.employee.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.employee.dao.pojo.Employeeeinfo;
import com.app.employee.util.EmployeeUtil;
import com.app.entity.EmployeeEntity;

public class EmployeeDao {

	public String persistEmp(Employeeeinfo empBean) {
		// Create sesson factory
		SessionFactory factory = EmployeeUtil.getFactory();
		// create sesson
		Transaction transaction = null;
		String status = null;
		try {
			Session session = factory.openSession();
			// create entity obj
			EmployeeEntity employeeEntty = new EmployeeEntity();
			employeeEntty.setEmpId(empBean.getEmpId());
			employeeEntty.setFirst_Name(empBean.getFirst_Name());
			employeeEntty.setLast_Name(empBean.getLast_Name());
			employeeEntty.setAddress(empBean.getAddress());
			System.out.println(employeeEntty);
			// create trangection obj and begin trangection
			transaction = session.beginTransaction();
			session.save(employeeEntty);
			transaction.commit();
			status = "success";
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			status = "falure";
			e.printStackTrace();
		} finally {
			EmployeeUtil.shutdown();
		}
		return status;
	}

}
