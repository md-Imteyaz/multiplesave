package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author vamsir
 *
 */

@Entity
@Table(name = "village")
public class Village implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long vid;
	private String name;
	private Long panchayath;
	private Long classification;
	private Long noOfHouseholds;
	private String route;
	private int pincode;
	private Date createdOn;
	private Long createdUser;
	private Date modifiedOn;
	private Long modifiedUser;
	private int active;

	public Long getVid() {
		return vid;
	}

	public void setVid(Long vid) {
		this.vid = vid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPanchayath() {
		return panchayath;
	}

	public void setPanchayath(Long panchayath) {
		this.panchayath = panchayath;
	}

	public Long getClassification() {
		return classification;
	}

	public void setClassification(Long classification) {
		this.classification = classification;
	}

	public Long getNoOfHouseholds() {
		return noOfHouseholds;
	}

	public void setNoOfHouseholds(Long noOfHouseholds) {
		this.noOfHouseholds = noOfHouseholds;
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

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Long getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(Long createdUser) {
		this.createdUser = createdUser;
	}

	public Long getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(Long modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Village [vid=" + vid + ", name=" + name + ", panchayath=" + panchayath + ", classification="
				+ classification + ", noOfHouseholds=" + noOfHouseholds + ", route=" + route + ", pincode=" + pincode
				+ ", createdOn=" + createdOn + ", createdUser=" + createdUser + ", modifiedOn=" + modifiedOn
				+ ", modifiedUser=" + modifiedUser + ", active=" + active + "]";
	}

}
