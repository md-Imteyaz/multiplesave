package com.example.demo.entity;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "series_data")
public class SeriesData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seriesId;
	private String name;
	@Convert(converter = com.example.demo.dto.Converter.class)
	private List<String> data;

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SeriesData [seriesId=" + seriesId + ", name=" + name + ", data=" + data + "]";
	}

}
