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
@Table(name = "branch_premise")
public class BranchPremise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchPremiseId;
	private int branchName;
	private int branchLocation;
	@OneToMany(targetEntity = PremiseInformation.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "premiseinformation_id", referencedColumnName = "branchPremiseId")
	private List<PremiseInformation> premiseInformation;

	public int getBranchPremiseId() {
		return branchPremiseId;
	}

	public void setBranchPremiseId(int branchPremiseId) {
		this.branchPremiseId = branchPremiseId;
	}

	public List<PremiseInformation> getPremiseInformation() {
		return premiseInformation;
	}

	public void setPremiseInformation(List<PremiseInformation> premiseInformation) {
		this.premiseInformation = premiseInformation;
	}

	public int getBranchName() {
		return branchName;
	}

	public void setBranchName(int branchName) {
		this.branchName = branchName;
	}

	public int getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(int branchLocation) {
		this.branchLocation = branchLocation;
	}

	@Override
	public String toString() {
		return "BranchPremise [branchPremiseId=" + branchPremiseId + ", branchName=" + branchName + ", branchLocation="
				+ branchLocation + ", premiseInformation=" + premiseInformation + "]";
	}

}
