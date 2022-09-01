package com.compass.aspp.service;

import com.compass.aspp.domain.Job;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.Job.class })
public interface JobService {

	public abstract long countAllJobs();


	public abstract void deleteJob(Job job);


	public abstract Job findJob(Long id);


	public abstract List<Job> findAllJobs();


	public abstract List<Job> findJobEntries(int firstResult, int maxResults);


	public abstract void saveJob(Job job) throws NotEnoughMaterialInStockException;


	public abstract Job updateJob(Job job, double d) throws NotEnoughMaterialInStockException;

}
