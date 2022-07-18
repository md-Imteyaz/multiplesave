package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "village_survey_form")
public class VillageSurveyForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int villageSurveyId;
	@OneToMany(targetEntity = VillageInformation.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "villageinfo_id", referencedColumnName = "villageSurveyId")
	private List<VillageInformation> villageInformation;
	@OneToMany(targetEntity = VillageSurvey.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "villagesurv_id", referencedColumnName = "villageSurveyId")
	private List<VillageSurvey> villageSurvey;

	public int getVillageSurveyId() {
		return villageSurveyId;
	}

	public void setVillageSurveyId(int villageSurveyId) {
		this.villageSurveyId = villageSurveyId;
	}

	public List<VillageInformation> getVillageInformation() {
		return villageInformation;
	}

	public void setVillageInformation(List<VillageInformation> villageInformation) {
		this.villageInformation = villageInformation;
	}

	public List<VillageSurvey> getVillageSurvey() {
		return villageSurvey;
	}

	public void setVillageSurvey(List<VillageSurvey> villageSurvey) {
		this.villageSurvey = villageSurvey;
	}

	@Override
	public String toString() {
		return "VillageSurveyForm [villageSurveyId=" + villageSurveyId + ", villageInformation=" + villageInformation
				+ ", villageSurvey=" + villageSurvey + "]";
	}

}
