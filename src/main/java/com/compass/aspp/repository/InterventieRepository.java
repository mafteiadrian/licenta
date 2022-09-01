package com.compass.aspp.repository;

import com.compass.aspp.domain.Interventie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = Interventie.class)
public interface InterventieRepository extends JpaSpecificationExecutor<Interventie>, JpaRepository<Interventie, Long> {
}
