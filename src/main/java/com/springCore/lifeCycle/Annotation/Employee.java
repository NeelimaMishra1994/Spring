package com.springCore.lifeCycle.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Implementing Bean LifeCycle using Annotations @postConstruct and @preDestroy 
//@postConstruct will provide you init functionality
//@preDestroy will provide you destroy functionality


public class Employee {
	 private double salary;

	@Override
	public String toString() {
		return "Employee salary is [salary=" + salary + "]";
	}

	public double getSalary() {
		System.out.println("getting salary");
		return salary;
	}
	
	public void setSalary(double salary) {
		System.out.println("Setting salary");
		this.salary = salary;
	}


	public Employee() {
		super();
		
	}
	@PostConstruct
	public void start() {
		System.out.println("inside init");
	}
	@PreDestroy
	public void end() {
		System.out.println("inside destroy");
	}
}
