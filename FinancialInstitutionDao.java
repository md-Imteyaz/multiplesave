package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.FinanceInstitutionDTO;
import com.example.demo.rowmapper.FinanceInstitutionRowMapper;

@Repository
public class FinancialInstitutionDao {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired(required = false)
	private HashMap<String, String> queries;

	private SimpleJdbcInsert simpleJdbcInsert;

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	private void postConstruct() {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("financial_info").withSchemaName("public")
				.usingGeneratedKeyColumns("id");
	}
	
	public List<FinanceInstitutionDTO> findAll() {
		return namedParameterJdbcTemplate.query(queries.get("financial_info_find_all"), new FinanceInstitutionRowMapper());
	}
}
