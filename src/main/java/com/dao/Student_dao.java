package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Student_dao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

//		int id = 1;
//		Student s = ss.get(Student.class, id);
//		s.setId(id);

		Student s = new Student();
		s.setId(4);
		s.setName("Sagar");
		s.setMobnu(1234567);
		s.setRollnu(13);
		s.setCity("Punr");
		s.setGender("male");

		ss.persist(s);
		System.out.println("OK");
		tr.commit();
		ss.close();

	}

}
