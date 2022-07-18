//package com.example.demo.dao;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.dto.RequestDto;
//import com.example.demo.model.Company;
//import com.example.demo.rowmapper.CompanyRowmapper;
//
//@Repository
//public class CompanyDao {
//
//	
//	@Autowired(required = false)
//	private HashMap<String, String> queries;
//
//	private SimpleJdbcInsert simpleJdbcInsert;
//
//	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//	@Autowired
//	private DataSource dataSource;
//
//	@PostConstruct
//	private void postConstruct() {
//		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
//		simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("new_company").withSchemaName("public")
//				.usingGeneratedKeyColumns("id");
//	}
//
////	@PostConstruct
////	private void postConstruct() {
////		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
////		simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("").withSchemaName("").
////	}
//	
//	/**
//	 * 
//	 * @param Company
//	 * @return
//	 */
//	public Company save(Company company) {
//		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(company);
//		company.setId((Long) simpleJdbcInsert.executeAndReturnKey(namedParameters));
//		return company;
//	}
//	
////	/**
////	 * 
////	 * @param Company
////	 * @return
////	 */
////	public RequestDto save(RequestDto company) {
////		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(company);
////		simpleJdbcInsert.executeAndReturnKey(namedParameters);
////		return company;
////	}
//
//	/**
//	 * 
//	 * @param id
//	 * @return
//	 */
//	public List<Company> findById(Long id) {
//		Map<String, Object> parameters = new HashMap<>();
//		parameters.put("id", id);
//		return namedParameterJdbcTemplate.query(queries.get("Company_find_by_id"), parameters, new CompanyRowmapper());
//	}
//
//	/**
//	 * 
//	 * @param Company
//	 * @return
//	 */
//	public Company update(Company company) {
//		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(company);
//		namedParameterJdbcTemplate.update(queries.get("Company_update"), namedParameters);
//		return company;
//	}
//
//	public List<Company> findAll() {
//		return namedParameterJdbcTemplate.query(queries.get("Company_find_all"), new CompanyRowmapper());
//	}
//}
