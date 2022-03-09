package com.rahma.materiels.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rahma.materiels.entities.Electrique;
import com.rahma.materiels.entities.Materiel;

@RepositoryRestResource(path = "rest")
public interface MaterielRepository extends JpaRepository <Materiel, Long > {
	List<Materiel> findByNomMateriel(String nom);
	List<Materiel> findByNomMaterielContains(String nom);
	@Query("select m from Materiel m where m.nomMateriel like %?1")
	List<Materiel> findByNom (String nom);
	@Query("select m from Materiel m where m.electrique = ?1")
	List<Materiel> findByElectrique (Electrique elect);
	List<Materiel> findByElectriqueIdElect(Long id);
}
