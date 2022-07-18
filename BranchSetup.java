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
@Table(name = "branch_setup")
public class BranchSetup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchSetupId;
	@OneToMany(targetEntity = ResourcePersonDetail.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "resourcedetails_id", referencedColumnName = "branchSetupId")
	private List<ResourcePersonDetail> resourceDetails;
	private boolean branchReadyForOperations;
	private String comments;
	@OneToMany(targetEntity = BranchSetupSurvey.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "setupsurvey_id", referencedColumnName = "branchSetupId")
	private List<BranchSetupSurvey> survey;

	public int getBranchSetupId() {
		return branchSetupId;
	}

	public void setBranchSetupId(int branchSetupId) {
		this.branchSetupId = branchSetupId;
	}

	public List<ResourcePersonDetail> getResourceDetails() {
		return resourceDetails;
	}

	public void setResourceDetails(List<ResourcePersonDetail> resourceDetails) {
		this.resourceDetails = resourceDetails;
	}

	public boolean isBranchReadyForOperations() {
		return branchReadyForOperations;
	}

	public void setBranchReadyForOperations(boolean branchReadyForOperations) {
		this.branchReadyForOperations = branchReadyForOperations;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<BranchSetupSurvey> getSurvey() {
		return survey;
	}

	public void setSurvey(List<BranchSetupSurvey> survey) {
		this.survey = survey;
	}

	@Override
	public String toString() {
		return "BranchSetup [branchSetupId=" + branchSetupId + ", resourceDetails=" + resourceDetails
				+ ", branchReadyForOperations=" + branchReadyForOperations + ", comments=" + comments + ", survey="
				+ survey + "]";
	}

}
