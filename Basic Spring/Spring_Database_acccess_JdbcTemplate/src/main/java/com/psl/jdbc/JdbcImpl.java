package com.psl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterMapper;
import org.springframework.jdbc.core.RowMapper;

import com.psl.bean.Employee;

public class JdbcImpl {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public Employee getEmployee(int empId) throws SQLException{

			/*Employee employee=new Employee();
		
			Connection connection = dataSource.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from employee where eid=?");
			statement.setInt(1,empId);
			ResultSet resultSet=statement.executeQuery();
			
			while(resultSet.next())
			{
				employee.setEmpName(resultSet.getString("ename"));
			}

		return employee;*/
		
		String string="select * from employee where eid=?";
	jdbcTemplate.queryForObject(string,new ParameterizedTypeReference() {
	},empId);

	}

}
