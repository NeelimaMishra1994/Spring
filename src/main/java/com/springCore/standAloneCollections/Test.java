package com.springCore.standAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.Autowiring.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/standAloneCollections/SACconfig.xml");
		 Person person = (Person) context.getBean("person");
		 System.out.println(person);
	}

}
