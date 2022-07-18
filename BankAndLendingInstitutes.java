package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_lending_institutions")
public class BankAndLendingInstitutes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long bankId;
	private String bankName;
	private String type;
	private int bankClients;

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBankClients() {
		return bankClients;
	}

	public void setBankClients(int bankClients) {
		this.bankClients = bankClients;
	}

	@Override
	public String toString() {
		return "BankAndLendingInstitutes [bankId=" + bankId + ", bankName=" + bankName + ", type=" + type
				+ ", bankClients=" + bankClients + "]";
	}

}
