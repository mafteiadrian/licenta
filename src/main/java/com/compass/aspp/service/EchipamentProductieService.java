package com.compass.aspp.service;

import com.compass.aspp.domain.EchipamentProductie;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.EchipamentProductie.class })
public interface EchipamentProductieService {

	public abstract long countAllEchipamentProducties();


	public abstract void deleteEchipamentProductie(EchipamentProductie echipamentProductie);


	public abstract EchipamentProductie findEchipamentProductie(Long id);


	public abstract List<EchipamentProductie> findAllEchipamentProducties();


	public abstract List<EchipamentProductie> findEchipamentProductieEntries(int firstResult, int maxResults);


	public abstract void saveEchipamentProductie(EchipamentProductie echipamentProductie);


	public abstract EchipamentProductie updateEchipamentProductie(EchipamentProductie echipamentProductie);

}
