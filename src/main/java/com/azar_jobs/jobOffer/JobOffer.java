package com.azar_jobs.jobOffer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.azar_jobs.user.candidate.Candidate;
import com.azar_jobs.user.employer.Employer;
@Entity
public class JobOffer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String description;
	private Date creationDate;
	private Date expirationDate;
	private String type;
	private List<String> levelStudy;
	private String requirements;
	private List<String> tags;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Candidate> candidate;
	
	@OneToOne
	private Employer employer;
	
	public JobOffer(String title, String description, Date creationDate, Date expirationDate, String type,
			List<String> levelStudy, String requirements, List<String> tags) {
		this.title = title;
		this.description = description;
		this.creationDate = creationDate;
		this.expirationDate = expirationDate;
		this.type = type;
		this.levelStudy = levelStudy;
		this.requirements = requirements;
		this.tags = tags;
		
		
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public String getType() {
		return type;
	}

	public List<String> getLevelStudy() {
		return levelStudy;
	}

	public String getRequirements() {
		return requirements;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLevelStudy(List<String> levelStudy) {
		this.levelStudy = levelStudy;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	

	public Set<Candidate> getCandidate() {
		return candidate;
	}

	public void setCandidate(Set<Candidate> candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "JobOffer [id=" + id + ", title=" + title + ", description=" + description + ", creationDate="
				+ creationDate + ", expirationDate=" + expirationDate + ", type=" + type + ", levelStudy=" + levelStudy
				+ ", requirements=" + requirements + ", tags=" + tags + "]";
	}
	
	
}
