package com.springCore.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/constructorInjection/ciconfig.xml");
		 Person p1 = (Person) context.getBean("person");
	    System.out.println(p1);

	}

}
