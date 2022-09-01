package com.compass.aspp.service;

import com.compass.aspp.domain.Angajat;
import com.compass.aspp.repository.AngajatRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AngajatServiceImpl implements AngajatService {

	@Autowired
    AngajatRepository angajatRepository;

	public long countAllAngajats() {
        return angajatRepository.count();
    }

	public void deleteAngajat(Angajat angajat) {
        angajatRepository.delete(angajat);
    }

	public Angajat findAngajat(Long id) {
        return angajatRepository.findOne(id);
    }

	public List<Angajat> findAllAngajats() {
        return angajatRepository.findAll();
    }

	public List<Angajat> findAngajatEntries(int firstResult, int maxResults) {
        return angajatRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveAngajat(Angajat angajat) {
        angajatRepository.save(angajat);
    }

	public Angajat updateAngajat(Angajat angajat) {
        return angajatRepository.save(angajat);
    }
}
