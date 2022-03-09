package com.rahma.materiels.service;

import java.util.List;

import com.rahma.materiels.entities.Electrique;
import com.rahma.materiels.entities.Materiel;
public interface MaterielService {
Materiel saveMateriel(Materiel m);
Materiel updateMateriel(Materiel m);
void deleteMateriel(Materiel m);
void deleteMaterielById(Long id);
Materiel getMateriel(Long id);
List<Materiel> getAllMateriels();
List<Materiel> findByNomMateriel(String nom);
List<Materiel> findByNomMaterielContains(String nom);
List<Materiel> findByNom (String nom);
List<Materiel> findByElectrique (Electrique electrique);
List<Materiel> findByElectriqueIdElect(Long id);

}