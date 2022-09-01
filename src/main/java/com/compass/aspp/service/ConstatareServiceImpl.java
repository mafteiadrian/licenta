package com.compass.aspp.service;

import com.compass.aspp.domain.Constatare;
import com.compass.aspp.repository.ConstatareRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ConstatareServiceImpl implements ConstatareService {

	@Autowired
    ConstatareRepository constatareRepository;

	public long countAllConstatares() {
        return constatareRepository.count();
    }

	public void deleteConstatare(Constatare constatare) {
        constatareRepository.delete(constatare);
    }

	public Constatare findConstatare(Long id) {
        return constatareRepository.findOne(id);
    }

	public List<Constatare> findAllConstatares() {
        return constatareRepository.findAll();
    }

	public List<Constatare> findConstatareEntries(int firstResult, int maxResults) {
        return constatareRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveConstatare(Constatare constatare) {
        constatareRepository.save(constatare);
    }

	public Constatare updateConstatare(Constatare constatare) {
        return constatareRepository.save(constatare);
    }
}
