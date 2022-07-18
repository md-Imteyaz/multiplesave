package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="records")
public class Records {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	private String particular;
	private boolean value;
	private int assetId;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getParticular() {
		return particular;
	}
	public void setParticular(String particular) {
		this.particular = particular;
	}
	public boolean isValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	@Override
	public String toString() {
		return "Records [rid=" + rid + ", particular=" + particular + ", value=" + value + ", assetId="
				+ assetId + "]";
	}
	
	
}
