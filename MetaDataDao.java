//package com.village.survey.dao;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//import org.springframework.stereotype.Repository;
//
//import com.village.survey.dto.BranchDTO;
//import com.village.survey.dto.DistrictNameDto;
//import com.village.survey.dto.MandalNameDto;
//import com.village.survey.dto.MetadataDto;
//import com.village.survey.dto.PanchayathNameDto;
//import com.village.survey.dto.StateNameDto;
//import com.village.survey.dto.VillageNameDto;
//import com.village.survey.entity.Branch;
//import com.village.survey.entity.District;
//import com.village.survey.entity.Mandal;
//import com.village.survey.entity.Panchayath;
//import com.village.survey.entity.State;
//import com.village.survey.entity.Village;
//import com.village.survey.rowmapper.BranchDTORowMapper;
//import com.village.survey.rowmapper.BranchRowMapper;
//import com.village.survey.rowmapper.DistrictDataRowMapper;
//import com.village.survey.rowmapper.MandalDataRowMapper;
//import com.village.survey.rowmapper.MetaDataRowMapper;
//import com.village.survey.rowmapper.PanchayathDataRowMapper;
//import com.village.survey.rowmapper.VillageDataRowMapper;
//@Repository
//public class MetaDataDao {
//
//	
//	private final Logger logger = LoggerFactory.getLogger(this.getClass());
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
////		simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("branch").withSchemaName("public")
////				.usingGeneratedKeyColumns("id");
//	}
//
//
//
//	public List<StateNameDto> findAllState() {
//		return namedParameterJdbcTemplate.query(queries.get("state_find_all"), new MetaDataRowMapper());
//	}
//	public List<DistrictNameDto> findAllDistrict() {
//		return namedParameterJdbcTemplate.query(queries.get("district_find_all"), new DistrictDataRowMapper());
//	}
//	public List<MandalNameDto> findAllMandal() {
//		return namedParameterJdbcTemplate.query(queries.get("mandal_find_all"), new MandalDataRowMapper());
//	}
//	public List<PanchayathNameDto> findAllPanchayath() {
//		return namedParameterJdbcTemplate.query(queries.get("panchayath_find_all"), new PanchayathDataRowMapper());
//	}
//	public List<VillageNameDto> findAllVillage() {
//		return namedParameterJdbcTemplate.query(queries.get("village_find_all"), new VillageDataRowMapper());
//	}
//
//
//}
