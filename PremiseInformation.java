package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premise_information")
public class PremiseInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int premiseId;
	private String type;
	private String comment;
	private int question;
//	@Convert(converter = Converter.class)
//	private List<String> options;
	private String value;

	public int getPremiseId() {
		return premiseId;
	}

	public void setPremiseId(int premiseId) {
		this.premiseId = premiseId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

//	public List<String> getOptions() {
//		return options;
//	}
//
//	public void setOptions(List<String> options) {
//		this.options = options;
//	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "PremiseInformation [premiseId=" + premiseId + ", type=" + type + ", comment=" + comment + ", question="
				+ question + ", value=" + value + "]";
	}

}
