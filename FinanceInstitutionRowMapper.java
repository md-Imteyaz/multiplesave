package com.example.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.dto.FinanceInstitutionDTO;

public class FinanceInstitutionRowMapper implements RowMapper<FinanceInstitutionDTO> {

	@Override
	public FinanceInstitutionDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		FinanceInstitutionDTO financeinstitutiondto = new FinanceInstitutionDTO();
		financeinstitutiondto.setNameOfMfi(rs.getString("nameOfMfi"));
		financeinstitutiondto.setDateOfBranchOpening(rs.getLong("dateOfBranchOpening"));
		financeinstitutiondto.setBranchchLocation(rs.getLong("branchchLocation"));
		financeinstitutiondto.setClientOutReach(rs.getString("clientOutReach"));
		financeinstitutiondto.setKeyReasonsForDefault(rs.getString("keyReasonsForDefault"));
		financeinstitutiondto.setPos(rs.getLong("pos"));
		financeinstitutiondto.setPar(rs.getLong("par"));
		return financeinstitutiondto;
	}

}
