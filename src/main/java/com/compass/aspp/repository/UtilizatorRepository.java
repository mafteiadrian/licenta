package com.compass.aspp.repository;

import com.compass.aspp.domain.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = Utilizator.class)
public interface UtilizatorRepository extends JpaRepository<Utilizator, Long>, JpaSpecificationExecutor<Utilizator> {
}
