package com.Findfile.Project.New.Exercise.Project.Entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerEntity 
{
	@Id
	//@GeneratedValue
	private int id;
	private String name;
	private String gender;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public CustomerEntity(int id, String name, String gender, int age) {
	
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	public CustomerEntity() {
		
	}
	
		
	}


