package com.psl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;

public class MainClass {

	public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	
	Employee employee = applicationContext.getBean("employee",Employee.class);
	
	System.out.println(employee.getEmpName());
	
	/*For setter injection we specify the property tag with anme and value of class private data members
	and in class through set() the values are initialize to the members.
	when the application is loaded the container have emp object with values initialize in it
	*
	*/
	employee.perform();
	
	
	}

}
