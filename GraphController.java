package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GraphDto;
import com.example.demo.dto.SurveyDto;
import com.example.demo.entity.GraphData;
import com.example.demo.entity.SurveyData;
import com.example.demo.repo.GraphRepo;
import com.example.demo.repo.SurveyDataRepo;

@RestController
public class GraphController {

	
	@Autowired
	GraphRepo repo;
	
	
	@PostMapping("/saveGraphData")
	private GraphData saveGraphData(@RequestBody GraphDto surveyDto) {
		return repo.save(surveyDto.getGraphData());

//			return "saved";
	}
}
