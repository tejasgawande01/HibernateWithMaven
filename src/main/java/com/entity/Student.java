package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private int rollnu;
	private String gender;
	private String city;
	private int mobnu;
	public Student() {
		super();
		
	}
	public Student(String name, int id, int rollnu, String gender, String city, int mobnu) {
		super();
		this.name = name;
		this.id = id;
		this.rollnu = rollnu;
		this.gender = gender;
		this.city = city;
		this.mobnu = mobnu;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", rollnu=" + rollnu + ", gender=" + gender + ", city=" + city
				+ ", mobnu=" + mobnu + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollnu() {
		return rollnu;
	}
	public void setRollnu(int rollnu) {
		this.rollnu = rollnu;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMobnu() {
		return mobnu;
	}
	public void setMobnu(int mobnu) {
		this.mobnu = mobnu;
	}
	
	
}
