package com.psl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;

public class MainClass {

	public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	
	Employee employee = applicationContext.getBean("employee",Employee.class);
	
	employee.perform();
	}

}
