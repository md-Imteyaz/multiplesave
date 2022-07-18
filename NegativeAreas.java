package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "negative_areas")
public class NegativeAreas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7156529532092842710L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long negativeAreaId;
	private Long branchAreaId;
	private String name;
	private Date createdOn;
	private Long createdUser;
	private Date modifiedOn;
	private Long modifiedUser;
	private int active;
	@OneToMany(targetEntity = RingLeader.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ring_id", referencedColumnName = "negativeAreaId")
	private List<RingLeader> ringLeaders;

	public Long getNegativeAreaId() {
		return negativeAreaId;
	}

	public void setNegativeAreaId(Long negativeAreaId) {
		this.negativeAreaId = negativeAreaId;
	}

	public List<RingLeader> getRingLeaders() {
		return ringLeaders;
	}

	public void setRingLeaders(List<RingLeader> ringLeaders) {
		this.ringLeaders = ringLeaders;
	}

	public Long getBranchAreaId() {
		return branchAreaId;
	}

	public void setBranchAreaId(Long branchAreaId) {
		this.branchAreaId = branchAreaId;
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
		return "NegativeAreas [negativeAreaId=" + negativeAreaId + ", branchAreaId=" + branchAreaId + ", name=" + name
				+ ", createdOn=" + createdOn + ", createdUser=" + createdUser + ", modifiedOn=" + modifiedOn
				+ ", modifiedUser=" + modifiedUser + ", active=" + active + ", ringLeaders=" + ringLeaders + "]";
	}

}
