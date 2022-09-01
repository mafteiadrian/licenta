package com.compass.aspp.service;

import com.compass.aspp.domain.Utilizator;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.Utilizator.class })
public interface UtilizatorService {

	public abstract long countAllUtilizators();


	public abstract void deleteUtilizator(Utilizator utilizator);


	public abstract Utilizator findUtilizator(Long id);


	public abstract List<Utilizator> findAllUtilizators();


	public abstract List<Utilizator> findUtilizatorEntries(int firstResult, int maxResults);


	public abstract void saveUtilizator(Utilizator utilizator);


	public abstract Utilizator updateUtilizator(Utilizator utilizator);
	
	public abstract Utilizator findByUsername(String numeUtilizator);

}
