package com.bad.entity;

public class Student {

	private Integer studId;
	private String name;
	private int age;
	private String city;
	
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public Student(Integer studId, String name, int age, String city) {
		
		this.studId = studId;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	
	
}