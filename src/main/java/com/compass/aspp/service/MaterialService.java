package com.compass.aspp.service;

import com.compass.aspp.domain.Material;
import java.util.List;
import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.compass.aspp.domain.Material.class })
public interface MaterialService {

	public abstract long countAllMaterials();


	public abstract void deleteMaterial(Material material);


	public abstract Material findMaterial(Long id);


	public abstract List<Material> findAllMaterials();


	public abstract List<Material> findMaterialEntries(int firstResult, int maxResults);


	public abstract void saveMaterial(Material material);


	public abstract Material updateMaterial(Material material);

}
