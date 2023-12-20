package com.springCore.Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/Autowiring/Autoconfig.xml");
		 Emp emp = (Emp) context.getBean("emp");
		 System.out.println(emp);
		 

	}

}
