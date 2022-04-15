package com.azar_jobs.models;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("employer")
public class Employer extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String adress;
	private String description;
	private String gov;
	private String sector;
	
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

	@Override
	public String toString() {
		return super.toString() +"Employer [name=" + name + ", adress=" + adress + ", description=" + description + ", gov=" + gov
				+ ", sector=" + sector +"]";
	}
	
	
	
	
}
