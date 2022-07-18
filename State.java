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
@Table(name = "state")
public class State implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long stateId;
	private String name;
	private Date createdOn;
	private Long createdUser;
	private Date modifiedOn;
	private Long modifiedUser;
	private int active;

	

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "State [stateId=" + stateId + ", name=" + name + ", createdOn=" + createdOn + ", createdUser=" + createdUser
				+ ", modifiedOn=" + modifiedOn + ", modifiedUser=" + modifiedUser + ", active=" + active + "]";
	}

}
