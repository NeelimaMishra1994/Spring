package com.springCore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/spel/spelConfig.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		SpelExpressionParser spelEParser=new SpelExpressionParser();
		Expression  exp=spelEParser.parseExpression("22+11");
		System.out.println(exp.getValue());
	}

}
