package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "village_survey")
public class VillageSurvey {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vsurveyId;
	private int question;
	private String value;

	public int getVsurveyId() {
		return vsurveyId;
	}

	public void setVsurveyId(int vsurveyId) {
		this.vsurveyId = vsurveyId;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "VillageSurvey [vsurveyId=" + vsurveyId + ", question=" + question + ", value=" + value + "]";
	}

}
