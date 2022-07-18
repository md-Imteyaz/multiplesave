package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.VillageInformation;

@Repository
public interface VillageInfoRepo extends JpaRepository<VillageInformation, Integer>{

	
//	@Query(value = "select * from village_information where vinfo_id= ?",nativeQuery = true)
//	public VillageInformation getVillageInfo(long vinfoId);
}
