package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "negative_occupation_info")
public class NegativeOccupationsInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int negativeOccupInfoId;
	private String negativeOccupation;
	private String area;

	public int getNegativeOccupInfoId() {
		return negativeOccupInfoId;
	}

	public void setNegativeOccupInfoId(int negativeOccupInfoId) {
		this.negativeOccupInfoId = negativeOccupInfoId;
	}

	public String getNegativeOccupation() {
		return negativeOccupation;
	}

	public void setNegativeOccupation(String negativeOccupation) {
		this.negativeOccupation = negativeOccupation;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "NegativeOccupationsInfo [negativeOccupInfoId=" + negativeOccupInfoId + ", negativeOccupation="
				+ negativeOccupation + ", area=" + area + "]";
	}

}
