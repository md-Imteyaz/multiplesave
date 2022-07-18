package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SetupDto;
import com.example.demo.dto.VillageSurveyDto;
import com.example.demo.entity.BranchSetup;
import com.example.demo.entity.VillageSurveyForm;
import com.example.demo.repo.BranchSetupRepo;
import com.example.demo.repo.VillageSurveyRepo;

@RestController
public class VillageSurveyController {

	
	@Autowired
	VillageSurveyRepo villageSurveyRepo;
	
	@PostMapping("/saveVillageSurvey")
	private VillageSurveyForm saveVillageSurvey(@RequestBody VillageSurveyDto setupDto) {
		return villageSurveyRepo.save(setupDto.getVillageSurveyForm());

//			return "saved";
	}
}
