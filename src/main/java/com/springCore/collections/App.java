package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collections/collectionconfig.xml");
        Employee e1 = (Employee) context.getBean("emp");
        System.out.println(e1);
       
    }
}
