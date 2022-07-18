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
@Table(name = "survey_data")
public class SurveyData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2125712255506563379L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long surveydataId;
	@OneToMany(targetEntity = BranchOperationalBlocks.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "operationalblocks_id", referencedColumnName = "surveydataId")
	private List<BranchOperationalBlocks> blocks;
	@OneToMany(targetEntity = FinancialInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "finfo_id", referencedColumnName = "surveydataId")
	private List<FinancialInfo> fInfo;
	@OneToMany(targetEntity = VillagesVisited.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "villagevisited_id", referencedColumnName = "surveydataId")
	private List<VillagesVisited> visited;
	@OneToMany(targetEntity = NegativeAreas.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nareas_id", referencedColumnName = "surveydataId")
	private List<NegativeAreas> negativeAreas;
	@OneToMany(targetEntity = NegativeOccupations.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "noccupations_id", referencedColumnName = "surveydataId")
	private List<NegativeOccupations> negativeOccupations;
	@OneToMany(targetEntity = Rating.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "rating_id", referencedColumnName = "surveydataId")
	private List<Rating> rating;
	@OneToMany(targetEntity = Recommendations.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "recommend_id", referencedColumnName = "surveydataId")
	private List<Recommendations> recommendations;

	public Long getSurveydataId() {
		return surveydataId;
	}

	public void setSurveydataId(Long surveydataId) {
		this.surveydataId = surveydataId;
	}

	public List<BranchOperationalBlocks> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<BranchOperationalBlocks> blocks) {
		this.blocks = blocks;
	}

	public List<FinancialInfo> getfInfo() {
		return fInfo;
	}

	public void setfInfo(List<FinancialInfo> fInfo) {
		this.fInfo = fInfo;
	}

	public List<VillagesVisited> getVisited() {
		return visited;
	}

	public void setVisited(List<VillagesVisited> visited) {
		this.visited = visited;
	}

	public List<NegativeAreas> getNegativeAreas() {
		return negativeAreas;
	}

	public void setNegativeAreas(List<NegativeAreas> negativeAreas) {
		this.negativeAreas = negativeAreas;
	}

	public List<NegativeOccupations> getNegativeOccupations() {
		return negativeOccupations;
	}

	public void setNegativeOccupations(List<NegativeOccupations> negativeOccupations) {
		this.negativeOccupations = negativeOccupations;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}

	public List<Recommendations> getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(List<Recommendations> recommendations) {
		this.recommendations = recommendations;
	}

	@Override
	public String toString() {
		return "SurveyData [surveydataId=" + surveydataId + ", blocks=" + blocks + ", fInfo=" + fInfo + ", visited="
				+ visited + ", negativeAreas=" + negativeAreas + ", negativeOccupations=" + negativeOccupations
				+ ", rating=" + rating + ", recommendations=" + recommendations + "]";
	}

}
