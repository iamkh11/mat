package com.rahma.materiels.service ; 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahma.materiels.entities.Electrique;
import com.rahma.materiels.entities.Materiel;
import com.rahma.materiels.repos.MaterielRepository;
@Service
public class MaterielServiceImpl implements MaterielService {
	@Autowired
	MaterielRepository materielRepository;
	@Override
	
public Materiel saveMateriel(Materiel m) {
	return materielRepository.save(m);

}
	@Override
	public Materiel updateMateriel(Materiel m) {
		return materielRepository.save(m);
	}
	@Override
	public void deleteMateriel(Materiel m) {
		materielRepository.delete(m);
		
	}
	@Override
	public void deleteMaterielById(Long id) {
		materielRepository.deleteById(id);
		
	}
	@Override
	public Materiel getMateriel(Long id) {
		return materielRepository.findById(id).get();
	}
	@Override
	public List<Materiel> getAllMateriels() {
		return materielRepository.findAll();
	}
	@Override
	public List<Materiel> findByNomMateriel(String nom) {
		return materielRepository.findByNomMateriel(nom);
	}
	@Override
	public List<Materiel> findByNomMaterielContains(String nom) {
		return materielRepository.findByNomMaterielContains(nom);
	}
	@Override
	public List<Materiel> findByNom(String nom) {
		return materielRepository.findByNom(nom);
	}
	@Override
	public List<Materiel> findByElectrique(Electrique electrique) {
		return materielRepository.findByElectrique(electrique);
	}
	@Override
	public List<Materiel> findByElectriqueIdElect(Long id) {
		return materielRepository.findByElectriqueIdElect(id);
	}
}
