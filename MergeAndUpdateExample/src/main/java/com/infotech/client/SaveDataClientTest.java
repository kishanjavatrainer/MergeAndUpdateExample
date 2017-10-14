package com.infotech.client;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.infotech.entities.Employee;
import com.infotech.util.HibernateUtil;

public class SaveDataClientTest {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			Employee employee = new Employee();
			employee.setEmployeeName("KK Bingel");
			employee.setEmail("KK.cs2017@gmail.com");
			employee.setSalary(50000.00);
			employee.setDoj(new Date());
			session.save(employee);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
