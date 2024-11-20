package com.job.app.jobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="myjobs")
public class Jobs {
@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	private String title;
	private String description;
	private String minSalary;
	private String maxSalary;
	private String location;
	private String jobType;
	private String experienceRequired;
	private String skillsRequired;

}
