package com.compass.aspp.service;

import com.compass.aspp.domain.Angajat;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.Angajat.class })
public interface AngajatService {

	public abstract long countAllAngajats();


	public abstract void deleteAngajat(Angajat angajat);


	public abstract Angajat findAngajat(Long id);


	public abstract List<Angajat> findAllAngajats();


	public abstract List<Angajat> findAngajatEntries(int firstResult, int maxResults);


	public abstract void saveAngajat(Angajat angajat);


	public abstract Angajat updateAngajat(Angajat angajat);

}
