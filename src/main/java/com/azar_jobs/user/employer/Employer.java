package com.azar_jobs.user.employer;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.azar_jobs.jobOffer.JobOffer;
import com.azar_jobs.user.User;
import com.azar_jobs.user.UserType;
@Entity
@DiscriminatorValue("employer")
public class Employer extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String adress;
	private String description;
	private String gov;
	private String sector;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="jobOfferId")
	private Set<JobOffer> jobOffer;
	
	public Employer(String email, String password, UserType userType, String name, String adress, String description,
			String gov, String sector) {
		super(email, password, userType);
		this.name = name;
		this.adress = adress;
		this.description = description;
		this.gov = gov;
		this.sector = sector;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGov() {
		return gov;
	}

	public void setGov(String gov) {
		this.gov = gov;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	

	public Set<JobOffer> getJobOffer() {
		return jobOffer;
	}

	public void setJobOffer(Set<JobOffer> jobOffer) {
		this.jobOffer = jobOffer;
	}

	@Override
	public String toString() {
		return super.toString() +"Employer [name=" + name + ", adress=" + adress + ", description=" + description + ", gov=" + gov
				+ ", sector=" + sector +"]";
	}
	
	
	
	
}
