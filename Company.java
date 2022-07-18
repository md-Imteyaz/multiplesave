package com.example.demo.model;

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
@Table(name = "new_company")
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7572390229106199680L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName = "id")
	private List<Employee> emp;

	@OneToMany(targetEntity = Trainee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "trainee_id", referencedColumnName = "id")
	private List<Trainee> trainee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public List<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", emp=" + emp + ", trainee=" + trainee + "]";
	}

}
