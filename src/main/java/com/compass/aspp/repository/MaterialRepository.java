package com.compass.aspp.repository;

import com.compass.aspp.domain.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = Material.class)
public interface MaterialRepository extends JpaSpecificationExecutor<Material>, JpaRepository<Material, Long> {
}
