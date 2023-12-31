package com.springCore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String Name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	
	
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}
	public Employee() {
		super();
	}
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		Name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
}
