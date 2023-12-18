package com.springCore.lifeCycle.XML;

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

//	public Employee(double salary) {
//		super();
//		this.salary = salary;
//	}
	public Employee() {
		super();
		
	}
	public void init() {
		System.out.println("inside init");
	}
	public void destroy() {
		System.out.println("inside destroy");
	}

}
