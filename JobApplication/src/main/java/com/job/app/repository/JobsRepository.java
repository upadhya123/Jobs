package com.job.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.app.jobs.entity.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Integer>{

	


}
