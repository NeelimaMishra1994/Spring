package com.springCore.lifeCycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Implementing Bean LifeCycle using interfaces initalizingBean and DisposableBean 
//initalizingBean will provide you init functionality
//DisposableBean will provide you destroy functionality
public class Employee implements InitializingBean,DisposableBean {
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
		System.out.println("Setting new salary");
		this.salary = salary;
	}


	public Employee() {
		super();
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside init");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy");
		
	}

}
