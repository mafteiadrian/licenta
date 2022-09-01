package com.compass.aspp.repository;

import com.compass.aspp.domain.Constatare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = Constatare.class)
public interface ConstatareRepository extends JpaSpecificationExecutor<Constatare>, JpaRepository<Constatare, Long> {
}
