package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "new_subclass")
public class SubClass implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5740690297798631579L;
	@Id
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "SubClass [sid=" + sid + ", sname=" + sname + "]";
	}
	
	

}
