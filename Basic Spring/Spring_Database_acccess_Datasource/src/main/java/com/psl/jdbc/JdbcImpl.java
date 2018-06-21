package com.psl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.psl.bean.Employee;

public class JdbcImpl {

	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public Employee getEmployee(int empId) throws SQLException{

			Employee employee=new Employee();
		
			Connection connection = dataSource.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from employee where eid=?");
			statement.setInt(1,1);
			ResultSet resultSet=statement.executeQuery();
			
			while(resultSet.next())
			{
				employee.setEmpName(resultSet.getString("ename"));
			}

		return employee;

	}

}
