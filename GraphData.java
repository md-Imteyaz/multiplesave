package com.example.demo.entity;

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
@Table(name="graph_data")
public class GraphData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int graphId;
	@OneToMany(targetEntity = AxisData.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "axisdata_id", referencedColumnName = "graphId")
	private List<AxisData> xAxis;
	@OneToMany(targetEntity = SeriesData.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "seriesdata_id", referencedColumnName = "graphId")
	private List<SeriesData> series;
	public int getGraphId() {
		return graphId;
	}
	public void setGraphId(int graphId) {
		this.graphId = graphId;
	}
	public List<AxisData> getXAxis() {
		return xAxis;
	}
	public void setXAxis(List<AxisData> xAxis) {
		this.xAxis = xAxis;
	}
	public List<SeriesData> getSeries() {
		return series;
	}
	public void setSeries(List<SeriesData> series) {
		this.series = series;
	}
	@Override
	public String toString() {
		return "GraphData [graphId=" + graphId + ", xAxis=" + xAxis + ", series=" + series + "]";
	}
	
	
}
