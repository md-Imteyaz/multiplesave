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
@Table(name = "mandal")
public class Mandal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long mandalId;
	private String name;
	private Long district;
	private Date createdOn;
	private Long createdUser;
	private Date modifiedOn;
	private Long modifiedUser;
	private int active;
	public Long getMandalId() {
		return mandalId;
	}
	public void setMandalId(Long mandalId) {
		this.mandalId = mandalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDistrict() {
		return district;
	}
	public void setDistrict(Long district) {
		this.district = district;
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
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public Long getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(Long modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Mandal [mandalId=" + mandalId + ", name=" + name + ", district=" + district + ", createdOn=" + createdOn
				+ ", createdUser=" + createdUser + ", modifiedOn=" + modifiedOn + ", modifiedUser=" + modifiedUser
				+ ", active=" + active + "]";
	}

	
}
