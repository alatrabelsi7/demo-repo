package com.azar_jobs.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("candidate")
public class Candidate extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String candidateName;
	private String familyName;
	private Date dateOfBirth;
	private String gov;
	private String civility;
	
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

	@Override
	public String toString() {
		return super.toString() +"Candidate [candidateName=" + candidateName + ", familyName=" + familyName + ", dateOfBirth="
				+ dateOfBirth + ", gov=" + gov + ", civility=" + civility + "]";
	}
	
	
	
	
}
