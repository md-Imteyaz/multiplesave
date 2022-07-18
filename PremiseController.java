package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BranchPremiseDto;
import com.example.demo.dto.SurveyDto;
import com.example.demo.entity.BranchPremise;
import com.example.demo.entity.PremiseInformation;
import com.example.demo.entity.SurveyData;
import com.example.demo.repo.PremisesRepository;

@RestController
public class PremiseController {

	@Autowired
	PremisesRepository premiseRepo;
	
	
	@PostMapping("/savePremises")
	private BranchPremise saveSurveyData(@RequestBody BranchPremiseDto surveyDto) {
		return premiseRepo.save(surveyDto.getBranchPremise());

//			return "saved";
	}
	
	 @GetMapping("/findAllPremises")
	    public List<BranchPremise> findAllOrders(){
	        return premiseRepo.findAll();
	    }
}
