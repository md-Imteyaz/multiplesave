package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "village_information")
public class VillageInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vinfoId;
	private int village;
	private int district;
	private int block;
	private int panchayath;
	private String route;
	private int pincode;

	public int getVinfoId() {
		return vinfoId;
	}

	public void setVinfoId(int vinfoId) {
		this.vinfoId = vinfoId;
	}

	public int getVillage() {
		return village;
	}

	public void setVillage(int village) {
		this.village = village;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getPanchayath() {
		return panchayath;
	}

	public void setPanchayath(int panchayath) {
		this.panchayath = panchayath;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "VillageInformation [vinfoId=" + vinfoId + ", village=" + village + ", district=" + district + ", block="
				+ block + ", panchayath=" + panchayath + ", route=" + route + ", pincode=" + pincode + "]";
	}

}
