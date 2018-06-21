package com.psl.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.jdbc.JdbcImpl;

public class MainClass {

	public static void main(String[] args) throws SQLException {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	
	JdbcImpl jdbcImpl = applicationContext.getBean("jdbcDataSource",JdbcImpl.class);
	Employee employee=jdbcImpl.getEmployee(1);
	
	System.out.println("Employee from DB-----------"+employee.getEmpName());
	
	/*Add constructor arg tag in .xml instaed of poperty and create parameter constructor in class to assign values from xml to fileds
	*/
	
	
	
	}

}
