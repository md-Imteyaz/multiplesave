package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.VillageSurveyForm;

public interface VillageSurveyRepo extends JpaRepository<VillageSurveyForm, Integer>{

}
