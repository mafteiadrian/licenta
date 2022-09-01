package com.compass.aspp.service;

import com.compass.aspp.domain.Utilizator;
import com.compass.aspp.repository.UtilizatorRepository;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UtilizatorServiceImpl implements UtilizatorService {

	@Autowired
    UtilizatorRepository utilizatorRepository;

	public long countAllUtilizators() {
        return utilizatorRepository.count();
    }

	public void deleteUtilizator(Utilizator utilizator) {
        utilizatorRepository.delete(utilizator);
    }

	public Utilizator findUtilizator(Long id) {
        return utilizatorRepository.findOne(id);
    }

	public List<Utilizator> findAllUtilizators() {
        return utilizatorRepository.findAll();
    }

	public List<Utilizator> findUtilizatorEntries(int firstResult, int maxResults) {
        return utilizatorRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveUtilizator(Utilizator utilizator) {
        utilizatorRepository.save(utilizator);
    }

	public Utilizator updateUtilizator(Utilizator utilizator) {
        return utilizatorRepository.save(utilizator);
    }

	@Override
	public Utilizator findByUsername(String numeUtilizator) {
		List<Utilizator> lisUtilizators = findAllUtilizators();
		for(Utilizator u : lisUtilizators){
			if(u.getNumeUtilizator().equals(numeUtilizator)){
				return u;
			}
		}
		return null;
	}
}
