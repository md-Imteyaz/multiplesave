package com.example.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.example.demo.model.Company;
import com.example.demo.model.Employee;

public class CompanyRowmapper implements org.springframework.jdbc.core.RowMapper<Company>{

	@Override
	public Company mapRow(ResultSet rs, int rowNum) throws SQLException {

		Company comp = new Company();
		comp.setId(rs.getLong("Id"));
		comp.setName(rs.getString("name"));
		List<Employee> listemp = new ArrayList<>();
		Employee emp = new Employee();
		listemp.add(emp);
		comp.setEmp(listemp);
				
		return comp;
	}

}
