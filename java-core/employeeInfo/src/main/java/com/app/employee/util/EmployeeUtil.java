package com.app.employee.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EmployeeUtil {

	private static SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			StandardServiceRegistry build = serviceRegistryBuilder.build();
			sessionFactory = configuration.buildSessionFactory(build);
		} catch (HibernateException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}

	public static SessionFactory getFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		sessionFactory.close();
	}

}
