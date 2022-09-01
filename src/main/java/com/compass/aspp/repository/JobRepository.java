package com.compass.aspp.repository;

import com.compass.aspp.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = Job.class)
public interface JobRepository extends JpaSpecificationExecutor<Job>, JpaRepository<Job, Long> {
}
