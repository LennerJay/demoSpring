package com.lenner.SpringRestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lenner.SpringRestDemo.model.JobPost;
import com.lenner.SpringRestDemo.service.JobService;

@RestController
public class JobController {

	@Autowired
	private JobService service;
	
	@GetMapping("jobPosts")
	@ResponseBody
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
	}
}
