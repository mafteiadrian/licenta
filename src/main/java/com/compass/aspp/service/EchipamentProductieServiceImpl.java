package com.compass.aspp.service;

import com.compass.aspp.domain.EchipamentProductie;
import com.compass.aspp.repository.EchipamentProductieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EchipamentProductieServiceImpl implements EchipamentProductieService {

	@Autowired
    EchipamentProductieRepository echipamentProductieRepository;

	public long countAllEchipamentProducties() {
        return echipamentProductieRepository.count();
    }

	public void deleteEchipamentProductie(EchipamentProductie echipamentProductie) {
        echipamentProductieRepository.delete(echipamentProductie);
    }

	public EchipamentProductie findEchipamentProductie(Long id) {
        return echipamentProductieRepository.findOne(id);
    }

	public List<EchipamentProductie> findAllEchipamentProducties() {
        return echipamentProductieRepository.findAll();
    }

	public List<EchipamentProductie> findEchipamentProductieEntries(int firstResult, int maxResults) {
        return echipamentProductieRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveEchipamentProductie(EchipamentProductie echipamentProductie) {
        echipamentProductieRepository.save(echipamentProductie);
    }

	public EchipamentProductie updateEchipamentProductie(EchipamentProductie echipamentProductie) {
        return echipamentProductieRepository.save(echipamentProductie);
    }
}
