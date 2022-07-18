package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "other_details")
public class OtherDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long otherId;
	private String contactPerson;
	private Long contactNumber;
	private int numberOfHouseholds;
	private int numberOfMilkCenters;
	private int numberOfKiranaShops;
	private int numberOfCosmeticsShops;
	private int numberOfOtherShops;
	private int numberOfTeaeastries;

	public Long getOtherId() {
		return otherId;
	}

	public void setOtherId(Long otherId) {
		this.otherId = otherId;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getNumberOfHouseholds() {
		return numberOfHouseholds;
	}

	public void setNumberOfHouseholds(int numberOfHouseholds) {
		this.numberOfHouseholds = numberOfHouseholds;
	}

	public int getNumberOfMilkCenters() {
		return numberOfMilkCenters;
	}

	public void setNumberOfMilkCenters(int numberOfMilkCenters) {
		this.numberOfMilkCenters = numberOfMilkCenters;
	}

	public int getNumberOfKiranaShops() {
		return numberOfKiranaShops;
	}

	public void setNumberOfKiranaShops(int numberOfKiranaShops) {
		this.numberOfKiranaShops = numberOfKiranaShops;
	}

	public int getNumberOfCosmeticsShops() {
		return numberOfCosmeticsShops;
	}

	public void setNumberOfCosmeticsShops(int numberOfCosmeticsShops) {
		this.numberOfCosmeticsShops = numberOfCosmeticsShops;
	}

	public int getNumberOfOtherShops() {
		return numberOfOtherShops;
	}

	public void setNumberOfOtherShops(int numberOfOtherShops) {
		this.numberOfOtherShops = numberOfOtherShops;
	}

	public int getNumberOfTeaeastries() {
		return numberOfTeaeastries;
	}

	public void setNumberOfTeaeastries(int numberOfTeaeastries) {
		this.numberOfTeaeastries = numberOfTeaeastries;
	}

	@Override
	public String toString() {
		return "OtherDetails [otherId=" + otherId + ", contactPerson=" + contactPerson + ", contactNumber="
				+ contactNumber + ", numberOfHouseholds=" + numberOfHouseholds + ", numberOfMilkCenters="
				+ numberOfMilkCenters + ", numberOfKiranaShops=" + numberOfKiranaShops + ", numberOfCosmeticsShops="
				+ numberOfCosmeticsShops + ", numberOfOtherShops=" + numberOfOtherShops + ", numberOfTeaeastries="
				+ numberOfTeaeastries + "]";
	}

}
