package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "new_employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5579219058924498796L;
	@Id
	private int eid;
	private String ename;
	@OneToMany(targetEntity = SubClass.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "sub_id", referencedColumnName = "eid")
	private List<SubClass> sub;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<SubClass> getSub() {
		return sub;
	}
	public void setSub(List<SubClass> sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sub=" + sub + "]";
	}
	
	
}