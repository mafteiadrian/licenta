package com.compass.aspp.service;

import com.compass.aspp.domain.Interventie;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.Interventie.class })
public interface InterventieService {

	public abstract long countAllInterventies();


	public abstract void deleteInterventie(Interventie interventie);


	public abstract Interventie findInterventie(Long id);


	public abstract List<Interventie> findAllInterventies();


	public abstract List<Interventie> findInterventieEntries(int firstResult, int maxResults);


	public abstract void saveInterventie(Interventie interventie);


	public abstract Interventie updateInterventie(Interventie interventie);

}
