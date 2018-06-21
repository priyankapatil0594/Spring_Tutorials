package com.psl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;

public class MainClass {

	public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

	Employee employee = applicationContext.getBean("employee",Employee.class);
	
	System.out.println(employee);
	
	/*Add constructor arg tag in .xml instaed of poperty and create parameter constructor in class to assign values from xml to fileds
	*/
	
	
	
	}

}
