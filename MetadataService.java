//package com.village.survey.services;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.village.survey.dao.DistrictDao;
//import com.village.survey.dao.MandalDao;
//import com.village.survey.dao.MetaDataDao;
//import com.village.survey.dao.PanchayathDao;
//import com.village.survey.dao.StateDao;
//import com.village.survey.dao.VillageDao;
//@Service
//public class MetadataService {
//
//	@Autowired
//	StateDao stateDao;
//	@Autowired
//	DistrictDao districtDao;
//	@Autowired
//	MandalDao mandalDao;
//	@Autowired
//	PanchayathDao panchayathDao;
//	@Autowired
//	VillageDao villageDao;
//	
//	@Autowired
//	MetaDataDao metaDataDao;
//
//	public List<List<?>> meta() {
//		List<?> state = metaDataDao.findAllState();
//		List<?> distrcit = metaDataDao.findAllDistrict();
//		List<?> mandal = metaDataDao.findAllMandal();
//		List<?> panchayath = metaDataDao.findAllPanchayath();
//		List<?> village = metaDataDao.findAllVillage();
//		List<List<?>> metaData = new ArrayList<>();
//		metaData.add(state);
//		metaData.add(distrcit);
//		metaData.add(mandal);
//		metaData.add(panchayath);
//		metaData.add(village);
//		return metaData;
//	}
//}
