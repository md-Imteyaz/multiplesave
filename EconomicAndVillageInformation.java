package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "economic_village")
public class EconomicAndVillageInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long economicId;
	private String villageName;
	private String districtName;
	private String mandalName;
	private long pincode;
	private String coordinates;
	private Date presentTime;

	public Long getEconomicId() {
		return economicId;
	}

	public void setEconomicId(Long economicId) {
		this.economicId = economicId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public Date getPresentTime() {
		return presentTime;
	}

	public void setPresentTime(Date presentTime) {
		this.presentTime = presentTime;
	}

	@Override
	public String toString() {
		return "EconomicAndVillageInformation [economicId=" + economicId + ", villageName=" + villageName
				+ ", districtName=" + districtName + ", mandalName=" + mandalName + ", pincode=" + pincode
				+ ", coordinates=" + coordinates + ", presentTime=" + presentTime + "]";
	}

}
