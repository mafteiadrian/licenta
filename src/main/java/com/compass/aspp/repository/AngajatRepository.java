package com.compass.aspp.repository;

import com.compass.aspp.domain.Angajat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = Angajat.class)
public interface AngajatRepository extends JpaRepository<Angajat, Long>, JpaSpecificationExecutor<Angajat> {
}
