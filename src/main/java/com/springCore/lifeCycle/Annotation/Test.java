package com.springCore.lifeCycle.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/Annotation/AlcConfig.xml");
		 Employee emp = (Employee) context.getBean("emp");
		 System.out.println(emp);
		 context.registerShutdownHook();

	}

}
