package com.azar_jobs.jobOffer;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobOfferService {
	
	private final JobOfferRepository jobOfferRepository;

	@Autowired
	public JobOfferService(JobOfferRepository jobOfferRepository) {
		this.jobOfferRepository = jobOfferRepository;
	}
	
	public List<JobOffer>getAllJobOffers(){
		return jobOfferRepository.findAll();
	}

	/*public void addNewJobOffer(JobOffer jobOffer) {
		
	}*/

	public Optional<JobOffer> getJobOfferById(int id) {
		return jobOfferRepository.findById(id);

	}

	public void deleteJobOffer(int jobOfferId) {
		boolean exists=jobOfferRepository.existsById(jobOfferId);
		if(!exists) {
			throw new IllegalStateException(
					"job offer with id "+jobOfferId+" does not exists!");
		}
		jobOfferRepository.deleteById(jobOfferId);
	}

	public Optional<JobOffer> getJobOfferByDate(Date date) {
		return jobOfferRepository.finJobOfferByDate(date);
	}
	
	
}
