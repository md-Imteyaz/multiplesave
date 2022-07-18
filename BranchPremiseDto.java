package com.example.demo.dto;

import com.example.demo.entity.BranchPremise;

public class BranchPremiseDto {

	private BranchPremise branchPremise;

	public BranchPremise getBranchPremise() {
		return branchPremise;
	}

	public void setBranchPremise(BranchPremise branchPremise) {
		this.branchPremise = branchPremise;
	}

	@Override
	public String toString() {
		return "BranchPremiseDto [branchPremise=" + branchPremise + "]";
	}

}
