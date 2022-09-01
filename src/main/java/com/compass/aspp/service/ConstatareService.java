package com.compass.aspp.service;

import com.compass.aspp.domain.Constatare;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.Constatare.class })
public interface ConstatareService {

	public abstract long countAllConstatares();


	public abstract void deleteConstatare(Constatare constatare);


	public abstract Constatare findConstatare(Long id);


	public abstract List<Constatare> findAllConstatares();


	public abstract List<Constatare> findConstatareEntries(int firstResult, int maxResults);


	public abstract void saveConstatare(Constatare constatare);


	public abstract Constatare updateConstatare(Constatare constatare);

}
