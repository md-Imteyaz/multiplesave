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
@Table(name = "negative_occupation")
public class NegativeOccupations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int negativeOccupationId;
	@OneToMany(targetEntity = NegativeOccupationsInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "noccupinfo_id", referencedColumnName = "negativeOccupationId")
	private List<NegativeOccupationsInfo> nOccupInfo;
	private String otherInformation;
	private String assessedRisk;

	public int getNegativeOccupationId() {
		return negativeOccupationId;
	}

	public void setNegativeOccupationId(int negativeOccupationId) {
		this.negativeOccupationId = negativeOccupationId;
	}

	public List<NegativeOccupationsInfo> getnOccupInfo() {
		return nOccupInfo;
	}

	public void setnOccupInfo(List<NegativeOccupationsInfo> nOccupInfo) {
		this.nOccupInfo = nOccupInfo;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public String getAssessedRisk() {
		return assessedRisk;
	}

	public void setAssessedRisk(String assessedRisk) {
		this.assessedRisk = assessedRisk;
	}

	@Override
	public String toString() {
		return "NegativeOccupations [negativeOccupationId=" + negativeOccupationId + ", nOccupInfo=" + nOccupInfo
				+ ", otherInformation=" + otherInformation + ", assessedRisk=" + assessedRisk + "]";
	}

}
