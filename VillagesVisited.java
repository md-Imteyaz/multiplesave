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
@Table(name = "villages_visited")
public class VillagesVisited {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long visitedId;
	@OneToMany(targetEntity = EconomicAndVillageInformation.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "economicinfo_id", referencedColumnName = "visitedId")
	private List<EconomicAndVillageInformation> economic;
	@OneToMany(targetEntity = OtherDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "otherdetails_id", referencedColumnName = "visitedId")
	private List<OtherDetails> otherDetails;
	@OneToMany(targetEntity = Activity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "act_id", referencedColumnName = "visitedId")
	private List<Activity> activity;
	@OneToMany(targetEntity = BankAndLendingInstitutes.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "bankinst_id", referencedColumnName = "visitedId")
	private List<BankAndLendingInstitutes> bank;

	public Long getVisitedId() {
		return visitedId;
	}

	public void setVisitedId(Long visitedId) {
		this.visitedId = visitedId;
	}

	public List<EconomicAndVillageInformation> getEconomic() {
		return economic;
	}

	public void setEconomic(List<EconomicAndVillageInformation> economic) {
		this.economic = economic;
	}

	public List<OtherDetails> getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(List<OtherDetails> otherDetails) {
		this.otherDetails = otherDetails;
	}

	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

	public List<BankAndLendingInstitutes> getBank() {
		return bank;
	}

	public void setBank(List<BankAndLendingInstitutes> bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "VillagesVisited [visitedId=" + visitedId + ", economic=" + economic + ", otherDetails=" + otherDetails
				+ ", activity=" + activity + ", bank=" + bank + "]";
	}

}
