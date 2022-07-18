package com.example.demo.dto;

import com.example.demo.entity.VillageSurveyForm;

public class VillageSurveyDto {

	private VillageSurveyForm villageSurveyForm;

	public VillageSurveyForm getVillageSurveyForm() {
		return villageSurveyForm;
	}

	public void setVillageSurveyForm(VillageSurveyForm villageSurveyForm) {
		this.villageSurveyForm = villageSurveyForm;
	}

	@Override
	public String toString() {
		return "VillageSurveyDto [villageSurveyForm=" + villageSurveyForm + "]";
	}

}
