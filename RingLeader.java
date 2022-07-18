package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ring_leader")
public class RingLeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ringLeaderId;
	private String ringLeader;
	private String identifier1;
	private String identifier2;

	public int getRingLeaderId() {
		return ringLeaderId;
	}

	public void setRingLeaderId(int ringLeaderId) {
		this.ringLeaderId = ringLeaderId;
	}

	public String getRingLeader() {
		return ringLeader;
	}

	public void setRingLeader(String ringLeader) {
		this.ringLeader = ringLeader;
	}

	public String getIdentifier1() {
		return identifier1;
	}

	public void setIdentifier1(String identifier1) {
		this.identifier1 = identifier1;
	}

	public String getIdentifier2() {
		return identifier2;
	}

	public void setIdentifier2(String identifier2) {
		this.identifier2 = identifier2;
	}

	@Override
	public String toString() {
		return "RingLeader [ringLeaderId=" + ringLeaderId + ", ringLeader=" + ringLeader + ", identifier1="
				+ identifier1 + ", identifier2=" + identifier2 + "]";
	}

}
