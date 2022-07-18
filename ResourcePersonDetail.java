package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resource_person_detail"
//state = {    resource_person_Detail: {      E_id: 123,      Name: "name",      Designation: "designation",      contact_number: "999999999",    },    branch_ready_for_ops: true,    comments: "comments",    survey: [      {        id: 1,        title: "HR_process_setup",        particular_records: [          {            id: 1,            particular: "Fan",            records: [              {                id: 1,                particular: "Fan",                value: true,                asset_id: 1234,              },            ],          },        ],      },      {        id: 2,        title: "IT_&_system",        particular_records: [],      },      {        id: 3,        title: "Furniture",        particular_records: [],      },      {        id: 4,        title: "Electrical_&_Fixture",        particular_records: [],      },      {        id: 5,        title: "Electrical_&_Fixture",        particular_records: [],      },      {        id: 6,        title: "Electrical_&_Fixture",        particular_records: [],      },      {        id: 7,        title: "Stationery_&_Consumables",        particular_records: [],      },    ],  },

)
public class ResourcePersonDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String name;
	private String designation;
	private Long contactNumber;

	public int getEId() {
		return eId;
	}

	public void setEId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "ResourcePersonDetail [eId=" + eId + ", name=" + name + ", designation=" + designation
				+ ", contactNumber=" + contactNumber + "]";
	}

}
