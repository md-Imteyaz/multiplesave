package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "negative_villages")
public class NegativeVillages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 921320073487314908L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long negativevillageId;
	private String villageName;
	private String negativeReason;

	public Long getNegativevillageId() {
		return negativevillageId;
	}

	public void setNegativevillageId(Long negativevillageId) {
		this.negativevillageId = negativevillageId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getNegativeReason() {
		return negativeReason;
	}

	public void setNegativeReason(String negativeReason) {
		this.negativeReason = negativeReason;
	}

	@Override
	public String toString() {
		return "NegativeVillages [negativevillageId=" + negativevillageId + ", villageName=" + villageName
				+ ", negativeReason=" + negativeReason + "]";
	}

}
