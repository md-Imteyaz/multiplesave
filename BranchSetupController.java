package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SetupDto;
import com.example.demo.dto.SurveyDto;
import com.example.demo.entity.BranchSetup;
import com.example.demo.entity.SurveyData;
import com.example.demo.repo.BranchSetupRepo;

@RestController
public class BranchSetupController {

	@Autowired
	BranchSetupRepo branchRepo;
	
	@PostMapping("/saveBranchSetup")
	private BranchSetup saveSurveyData(@RequestBody SetupDto setupDto) {
		return branchRepo.save(setupDto.getBranchSetup());

//			return "saved";
	}
	
	 @GetMapping("/findAllBranchSetups")
	    public List<BranchSetup> findAllOrders(){
	        return branchRepo.findAll();
	    }
	
}
