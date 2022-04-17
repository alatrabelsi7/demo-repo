package com.azar_jobs.jobOffer;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOffer, Integer> {
	
	@Query("SELECT * FROM JobOffer jo WHERE jo.creationDate=?1")
	Optional<JobOffer> finJobOfferByDate(Date date);
}
