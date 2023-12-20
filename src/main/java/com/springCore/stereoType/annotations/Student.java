package com.springCore.stereoType.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
	
	@Value("Neelima Mishra")
	private String name;
	@Value("United Kingdom")
	private String city;
	@Value("#{address}")//collection with @value
	private List<String> address;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
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
	public Student() {
		super();
	}

}
