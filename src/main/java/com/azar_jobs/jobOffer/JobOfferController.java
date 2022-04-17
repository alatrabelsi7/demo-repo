package com.azar_jobs.jobOffer;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/jobOffer")
public class JobOfferController {
	
	private final JobOfferService jobOfferService;
	
	@Autowired
	public JobOfferController(JobOfferService jobOfferService) {
		this.jobOfferService = jobOfferService;
	}
	
	@GetMapping
	public List<JobOffer> getAllJobOffers(){
		return jobOfferService.getAllJobOffers();
	}
	
	@GetMapping
	public Optional<JobOffer> getJobOfferById(int id){
		return jobOfferService.getJobOfferById(id);
	}
	
	@GetMapping
	public Optional<JobOffer> getJobOfferByDate(Date date){
		return jobOfferService.getJobOfferByDate(date);
	}
	@DeleteMapping(path="{jobOfferId}")
	public void deleteJobOffer(@PathVariable("jobOfferId")int jobOfferId) {
		jobOfferService.deleteJobOffer(jobOfferId);
	}
	
	
	
	/*@PostMapping
	public void  registerNewJobOffer(JobOffer jobOffer) {
		jobOfferService.addNewJobOffer(jobOffer);
	}*/
}
