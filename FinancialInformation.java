package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "financial_info")
public class FinancialInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4846899278639213134L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long finformationId;
	private String institutionName;
	private String contactPerson;
	private Long contactNumber;
	private String coordinates;
	private Date operatingSince;

	public Long getfinformationId() {
		return finformationId;
	}

	public void setfinformationId(Long finformationId) {
		this.finformationId = finformationId;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
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

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public Date getOperatingSince() {
		return operatingSince;
	}

	public void setOperatingSince(Date operatingSince) {
		this.operatingSince = operatingSince;
	}

	@Override
	public String toString() {
		return "FinancialInformation [finformationId=" + finformationId + ", institutionName=" + institutionName
				+ ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + ", coordinates="
				+ coordinates + ", operatingSince=" + operatingSince + "]";
	}

}