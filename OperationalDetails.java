package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operational_details")
public class OperationalDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9053358494421264564L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long oid;
	private Long clientDetail;
	private Long pos;
	private Long par;
	private Long amtPar;

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getClientDetail() {
		return clientDetail;
	}

	public void setClientDetail(Long clientDetail) {
		this.clientDetail = clientDetail;
	}

	public Long getPos() {
		return pos;
	}

	public void setPos(Long pos) {
		this.pos = pos;
	}

	public Long getPar() {
		return par;
	}

	public void setPar(Long par) {
		this.par = par;
	}

	public Long getAmtPar() {
		return amtPar;
	}

	public void setAmtPar(Long amtPar) {
		this.amtPar = amtPar;
	}

	@Override
	public String toString() {
		return "OperationalDetails [oid=" + oid + ", clientDetail=" + clientDetail + ", pos=" + pos + ", par=" + par
				+ ", amtPar=" + amtPar + "]";
	}

}