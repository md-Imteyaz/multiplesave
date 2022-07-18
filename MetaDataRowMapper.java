//package com.village.survey.rowmapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import com.village.survey.dao.StateDao;
//import com.village.survey.dto.MetadataDto;
//import com.village.survey.dto.StateNameDto;
//import com.village.survey.entity.District;
//import com.village.survey.entity.Mandal;
//import com.village.survey.entity.Panchayath;
//import com.village.survey.entity.State;
//import com.village.survey.entity.Village;
//
//public class MetaDataRowMapper implements RowMapper<StateNameDto> {
//
//	@Override
//	public StateNameDto mapRow(ResultSet rs, int rowNum) throws SQLException {
//		StateNameDto meta= new StateNameDto();
//		meta.setName(rs.getString("state_name"));
////		meta.setDistrictName(rs.getString("district_name"));
////		meta.setMandalName(rs.getString("mandal_name"));
////		meta.setPanchayathName(rs.getString("panchayath_name"));
////		meta.setVillageName(rs.getString("village_name"));
//		return meta;
//	}
//
//}
//
