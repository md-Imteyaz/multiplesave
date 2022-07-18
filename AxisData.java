package com.example.demo.entity;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="axis_data")
public class AxisData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int axisId;
	@Convert(converter = com.example.demo.dto.Converter.class)
	private List<String> categories;
	public int getAxisId() {
		return axisId;
	}
	public void setAxisId(int axisId) {
		this.axisId = axisId;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "AxisData [axisId=" + axisId + ", categories=" + categories + "]";
	}
	
	
}
