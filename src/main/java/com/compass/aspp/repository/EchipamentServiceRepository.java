package com.compass.aspp.repository;

import com.compass.aspp.domain.EchipamentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = EchipamentService.class)
public interface EchipamentServiceRepository extends JpaSpecificationExecutor<EchipamentService>, JpaRepository<EchipamentService, Long> {
}
