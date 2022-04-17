package com.azar_jobs.user.candidate;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.azar_jobs.jobOffer.JobOffer;
import com.azar_jobs.user.User;
import com.azar_jobs.user.UserType;
@Entity
@DiscriminatorValue("candidate")
public class Candidate extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String candidateName;
	private String familyName;
	private Date dateOfBirth;
	private String gov;
	private String civility;
	
	@ManyToMany( cascade = 
			CascadeType.ALL, mappedBy = "candidate")
			private Set<JobOffer> jobOffer;
	
	public Candidate(String email, String password, UserType userType, String candidateName, String familyName,
			Date dateOfBirth, String gov, String civility) {
		super(email, password, userType);
		this.candidateName = candidateName;
		this.familyName = familyName;
		this.dateOfBirth = dateOfBirth;
		this.gov = gov;
		this.civility = civility;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGov() {
		return gov;
	}

	public void setGov(String gov) {
		this.gov = gov;
	}

	public String getCivility() {
		return civility;
	}

	public void setCivility(String civility) {
		this.civility = civility;
	}
	
	

	public Set<JobOffer> getJobOffer() {
		return jobOffer;
	}

	public void setJobOffer(Set<JobOffer> jobOffer) {
		this.jobOffer = jobOffer;
	}

	@Override
	public String toString() {
		return super.toString() +"Candidate [candidateName=" + candidateName + ", familyName=" + familyName + ", dateOfBirth="
				+ dateOfBirth + ", gov=" + gov + ", civility=" + civility + "]";
	}
	
	
	
	
}
