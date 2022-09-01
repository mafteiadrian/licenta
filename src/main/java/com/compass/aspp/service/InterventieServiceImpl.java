package com.compass.aspp.service;

import com.compass.aspp.domain.Interventie;
import com.compass.aspp.repository.InterventieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class InterventieServiceImpl implements InterventieService {

	@Autowired
    InterventieRepository interventieRepository;

	public long countAllInterventies() {
        return interventieRepository.count();
    }

	public void deleteInterventie(Interventie interventie) {
        interventieRepository.delete(interventie);
    }

	public Interventie findInterventie(Long id) {
        return interventieRepository.findOne(id);
    }

	public List<Interventie> findAllInterventies() {
        return interventieRepository.findAll();
    }

	public List<Interventie> findInterventieEntries(int firstResult, int maxResults) {
        return interventieRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveInterventie(Interventie interventie) {
        interventieRepository.save(interventie);
    }

	public Interventie updateInterventie(Interventie interventie) {
        return interventieRepository.save(interventie);
    }
}
