package com.service;

import com.dao.Student_dao;

public class Student_Service {

	public void InsertData(){
		
		Student_dao sd = new Student_dao();
		sd.insertData();
		
	}
}
