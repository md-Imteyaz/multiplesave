package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.VillageInformation;
import com.example.demo.repo.SurveyDataRepo;
import com.example.demo.repo.VillageInfoRepo;
import com.example.demo.repo.VillageSurveyRepo;

@Service
public class VillageInfoService {

	@Autowired
	VillageInfoRepo repo;

//	public VillageInformation getAll(int vinfoId) {
//		return repo.getVillageInfo(vinfoId);
//	}
}
