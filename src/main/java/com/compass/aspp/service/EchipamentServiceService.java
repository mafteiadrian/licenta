package com.compass.aspp.service;

import com.compass.aspp.domain.EchipamentService;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.EchipamentService.class })
public interface EchipamentServiceService {

	public abstract long countAllEchipamentServices();


	public abstract void deleteEchipamentService(EchipamentService echipamentService);


	public abstract EchipamentService findEchipamentService(Long id);


	public abstract List<EchipamentService> findAllEchipamentServices();


	public abstract List<EchipamentService> findEchipamentServiceEntries(int firstResult, int maxResults);


	public abstract void saveEchipamentService(EchipamentService echipamentService);


	public abstract EchipamentService updateEchipamentService(EchipamentService echipamentService);

}
