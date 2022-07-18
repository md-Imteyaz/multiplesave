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
@Table(name = "branch_setup_survey")
public class BranchSetupSurvey {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int surveyId;
	private String title;
	@OneToMany(targetEntity = ParticularRecords.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "records_id", referencedColumnName = "surveyId")
	private List<ParticularRecords> particularRecords;

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ParticularRecords> getParticularRecords() {
		return particularRecords;
	}

	public void setParticularRecords(List<ParticularRecords> particularRecords) {
		this.particularRecords = particularRecords;
	}

	@Override
	public String toString() {
		return "BranchSetupSurvey [surveyId=" + surveyId + ", title=" + title + ", particularRecords=" + particularRecords + "]";
	}

}
