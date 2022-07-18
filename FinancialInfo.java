package com.example.demo.entity;

import java.io.Serializable;
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
@Table(name = "financial_institutes")
public class FinancialInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3238166258233449442L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long financialinfoId;
	@OneToMany(targetEntity = FinancialInformation.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "info_id", referencedColumnName = "financialinfoId")
	private List<FinancialInformation> info;
	@OneToMany(targetEntity = OperationalDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "details_id", referencedColumnName = "financialinfoId")
	private List<OperationalDetails> oDetails;
	@OneToMany(targetEntity = MajorPARVillages.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "mpar_id", referencedColumnName = "financialinfoId")
	private List<MajorPARVillages> mpar;
	@OneToMany(targetEntity = NegativeVillages.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nvillages_id", referencedColumnName = "financialinfoId")
	private List<NegativeVillages> nVillages;
	public Long getFinancialinfoId() {
		return financialinfoId;
	}
	public void setFinancialinfoId(Long financialinfoId) {
		this.financialinfoId = financialinfoId;
	}
	public List<FinancialInformation> getInfo() {
		return info;
	}
	public void setInfo(List<FinancialInformation> info) {
		this.info = info;
	}
	public List<OperationalDetails> getoDetails() {
		return oDetails;
	}
	public void setoDetails(List<OperationalDetails> oDetails) {
		this.oDetails = oDetails;
	}
	public List<MajorPARVillages> getMpar() {
		return mpar;
	}
	public void setMpar(List<MajorPARVillages> mpar) {
		this.mpar = mpar;
	}
	public List<NegativeVillages> getnVillages() {
		return nVillages;
	}
	public void setnVillages(List<NegativeVillages> nVillages) {
		this.nVillages = nVillages;
	}
	@Override
	public String toString() {
		return "FinancialInfo [financialinfoId=" + financialinfoId + ", info=" + info + ", oDetails=" + oDetails
				+ ", mpar=" + mpar + ", nVillages=" + nVillages + "]";
	}
	
	
}
