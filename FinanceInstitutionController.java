package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.FinancialInstitutionDao;
import com.example.demo.dto.FinanceInstitutionDTO;

@RestController
@RequestMapping("/FinaceInstituteApi")
public class FinanceInstitutionController {
	@Autowired
	private FinancialInstitutionDao financialinstitutiondao;

	@GetMapping("/findAllFinaceInstitute")
	public List<FinanceInstitutionDTO> findAllInstitution() {
		return financialinstitutiondao.findAll();
	}

}
