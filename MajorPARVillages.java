package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "major_villages")
public class MajorPARVillages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4697304886476109142L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long majorparId;
	private String name;
	private int clients;
	private String reasons;

	public Long getMajorparId() {
		return majorparId;
	}

	public void setMajorparId(Long majorparId) {
		this.majorparId = majorparId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClients() {
		return clients;
	}

	public void setClients(int clients) {
		this.clients = clients;
	}

	public String getReasons() {
		return reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	@Override
	public String toString() {
		return "MajorPARVillages [majorparId=" + majorparId + ", name=" + name + ", clients=" + clients + ", reasons="
				+ reasons + "]";
	}

}
