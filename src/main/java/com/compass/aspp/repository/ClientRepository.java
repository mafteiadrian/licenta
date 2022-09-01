package com.compass.aspp.repository;

import com.compass.aspp.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RooJpaRepository(domainType = Client.class)
public interface ClientRepository extends JpaRepository<Client, Long>, JpaSpecificationExecutor<Client> {
}
