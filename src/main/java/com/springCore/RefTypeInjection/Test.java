package com.springCore.RefTypeInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/RefTypeInjection/refconfig.xml");
		 A a = (A) context.getBean("aref");
		 System.out.println(a.getX());
		 System.out.println(a.getObj().getY());

	}

}

