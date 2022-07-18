package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_trainee")
public class Trainee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8717207152217888718L;
	@Id
	private int tid;
	private String tname;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", tname=" + tname + "]";
	}

}
