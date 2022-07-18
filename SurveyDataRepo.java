package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SurveyData;
import com.example.demo.entity.VillageInformation;

@Repository
public interface SurveyDataRepo extends JpaRepository<SurveyData, Integer> {

}
