package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PincodeDto;
import com.example.demo.dto.RequestDto;
import com.example.demo.dto.SurveyDto;
import com.example.demo.entity.SurveyData;
import com.example.demo.entity.VillageInformation;
import com.example.demo.model.Company;
import com.example.demo.model.Employee;
//import com.example.demo.service.CompanyService;
//import com.example.demo.repo.EntityRepo;
import com.example.demo.repo.SurveyDataRepo;
import com.example.demo.repo.VillageInfoRepo;
import com.example.demo.service.VillageInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CompanyController {

//	@Autowired
//	CompanyService comserv;

//	@Autowired
//	EntityRepo repo;

	@Autowired
	SurveyDataRepo surveyRepo;
	
	@Autowired
	VillageInfoService serv;
	
	@Autowired
	VillageInfoRepo repo;

//	@PostMapping("/save")
//	private String saveCompany(@RequestBody RequestDto dto) {
//		comserv.saveCompany(dto.getCompany());
//		return "saved";
//	}

//	@PostMapping("/save")
//	private Company saveCompany(@RequestBody RequestDto dto) {
//		return comserv.saveCompany(dto.getCompany());
////		return "saved";
//	}

//	 @GetMapping("/findAll")
//	    public List<Company> findAllOrders(){
//	        return repo.findAll();
//	    }

	@PostMapping("/saveData")
	private SurveyData saveSurveyData(@RequestBody SurveyDto surveyDto) {
		return surveyRepo.save(surveyDto.getSdata());

//			return "saved";
	}

	 @GetMapping("/findAllMetaData")
	    public List<SurveyData> findAllOrders(){
	        return surveyRepo.findAll();
	    }

	
//	 @GetMapping("/findAllVillageInfo/{vinfoId}")
//	    public VillageInformation findAll(@PathVariable(value="vinfoId") int vinfoId){
//	        return serv.getAll(vinfoId);
//	    }
	 
	 @GetMapping("/findAllVillageInfo")
	    public List<VillageInformation> findAll(){
	        return repo.findAll();
	    }
	 
	
//	@PostMapping("/saveData")
//	private SurveyData saveSurveyData(@RequestBody SurveyData surveyDto) {
//		return surveyRepo.save(surveyDto.);
//			return "saved";
//	}

}
