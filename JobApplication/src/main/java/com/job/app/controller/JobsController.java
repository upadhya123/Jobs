package com.job.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.app.jobs.entity.Jobs;
import com.job.app.services.JobService;

@RestController
@RequestMapping("/jobApp")
public class JobsController {	
	@Autowired
	JobService jobService;
	
	@GetMapping ("/get/job")
	public List<Jobs> getAllJobs(){
		return jobService.getAllJobs();
	}
	@PostMapping("/create")
	public Jobs createJob(@RequestBody Jobs job) {
        return jobService.createJob(job);
	}
	

}
