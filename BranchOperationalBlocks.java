package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "operational_area")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BranchOperationalBlocks implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchoperationalsId;
	private Long stateId;
	private Long districtId;
	private Long blocksId;
//	@Column(name = "pincode", columnDefinition = "varchar[]")
//	@ElementCollection(targetClass = String.class)
//	@JsonProperty("pincode")
	@Convert(converter = com.example.demo.dto.Converter.class)
	private List<String> pincode;

	public int getBranchoperationalsId() {
		return branchoperationalsId;
	}

	public void setBranchoperationalsId(int branchoperationalsId) {
		this.branchoperationalsId = branchoperationalsId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getBlocksId() {
		return blocksId;
	}

	public void setBlocksId(Long blocksId) {
		this.blocksId = blocksId;
	}

	public void setPincode(List<String> pincode) {
		this.pincode = pincode;
	}

//	public List<Integer> getPincode() {
//		List<Integer> lstVals = new ArrayList<Integer>();
//		int val = 0;
//
//		for (String field : this.pincode.split(",")) {
//			try {
//				val = Integer.parseInt(field);
//			}
//			// If the String contains other thing that digits and commas
//			catch (NumberFormatException e) {
//			}
//			lstVals.add(val);
//		}
//
//		return lstVals;
//	}
//
//	public void setPincode(List<Integer> pincode) {
//		String newVals = "";
//		for (Integer i : pincode) {
//			newVals.concat(String.valueOf(i));
//		}
//		this.pincode = newVals;
//	}

	public List<String> getPincode() {
		return pincode;
	}

	@Override
	public String toString() {
		return "BranchOperationalBlocks [branchoperationalsId=" + branchoperationalsId + ", stateId=" + stateId
				+ ", districtId=" + districtId + ", blocksId=" + blocksId + ", pincode=" + pincode + "]";
	}

}
