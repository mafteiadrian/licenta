package com.compass.aspp.service;

import com.compass.aspp.domain.Material;
import com.compass.aspp.repository.MaterialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class MaterialServiceImpl implements MaterialService {

	@Autowired
    MaterialRepository materialRepository;

	public long countAllMaterials() {
        return materialRepository.count();
    }

	public void deleteMaterial(Material material) {
        materialRepository.delete(material);
    }

	public Material findMaterial(Long id) {
        return materialRepository.findOne(id);
    }

	public List<Material> findAllMaterials() {
        return materialRepository.findAll();
    }

	public List<Material> findMaterialEntries(int firstResult, int maxResults) {
        return materialRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveMaterial(Material material) {
        materialRepository.save(material);
    }

	public Material updateMaterial(Material material) {
        return materialRepository.save(material);
    }
}
