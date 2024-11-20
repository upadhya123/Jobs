package com.job.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.app.jobs.entity.Jobs;
import com.job.app.repository.JobsRepository;

@Service
public class JobService {
	
	@Autowired
	JobsRepository jobsRepository;

	public List<Jobs> getAllJobs() {
		return jobsRepository.findAll();
	}

	public Jobs createJob(Jobs jobs) {
		return jobsRepository.save(jobs);
	}

	

}
