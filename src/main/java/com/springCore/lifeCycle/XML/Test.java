package com.springCore.lifeCycle.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/XML/lcConfig.xml");
		 Employee emp = (Employee) context.getBean("emp");
		 System.out.println(emp);
		 //here to call destroy method we have AbstractApplicationContext,because in that registerShutDownHook method is present which calls
		 //destrroy method
		 context.registerShutdownHook();

	}

}
