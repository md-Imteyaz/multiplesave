package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recommendations")
public class Recommendations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recomId;
	private String option1;
	private int block1;
	private String option2;
	private int block2;
	private String finalRecommendations;

	public int getRecomId() {
		return recomId;
	}

	public void setRecomId(int recomId) {
		this.recomId = recomId;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public int getBlock1() {
		return block1;
	}

	public void setBlock1(int block1) {
		this.block1 = block1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public int getBlock2() {
		return block2;
	}

	public void setBlock2(int block2) {
		this.block2 = block2;
	}

	public String getFinalRecommendations() {
		return finalRecommendations;
	}

	public void setFinalRecommendations(String finalRecommendations) {
		this.finalRecommendations = finalRecommendations;
	}

	@Override
	public String toString() {
		return "Recommendations [recomId=" + recomId + ", option1=" + option1 + ", block1=" + block1 + ", option2="
				+ option2 + ", block2=" + block2 + ", finalRecommendations=" + finalRecommendations + "]";
	}

}
