package com.example.demo.dto;

import com.example.demo.model.Company;

public class RequestDto {

	private Company company;

	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "RequestDto [company=" + company + "]";
	}

}
