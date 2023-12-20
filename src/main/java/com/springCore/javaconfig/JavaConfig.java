package com.springCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springCore.javaconfig")

public class JavaConfig {
	
	@Bean
	public Address getAddress() {
		return new Address();
		
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getAddress());
		return student;
		
	}

}
