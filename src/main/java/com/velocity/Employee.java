package com.velocity;

public class Employee {
	
	private String firstname;
	private String age;
	private String city;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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
		return "Employee [firstname=" + firstname + ", age=" + age + ", city=" + city + "]";
	}

	
}



