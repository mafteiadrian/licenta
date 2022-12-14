package com.compass.aspp.repository;

import com.compass.aspp.domain.EchipamentProductie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = EchipamentProductie.class)
public interface EchipamentProductieRepository extends JpaSpecificationExecutor<EchipamentProductie>, JpaRepository<EchipamentProductie, Long> {
}
