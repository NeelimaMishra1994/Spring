package com.springCore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {

	@Value("Neelima")
	private String name;
	@Value("scotland")
	private String city;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String name, String city, Address address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	public Student(Address address) 
	{
		super();
		this.address=address;
		
	}
	public void study() {
		this.address.display();
		System.out.println("i am studying");
	}

}
