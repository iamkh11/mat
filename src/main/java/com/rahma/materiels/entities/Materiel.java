package com.rahma.materiels.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;




@Entity
public class Materiel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMateriel;
private String nomMateriel;
private String description ; 
private String marque ; 
private Double quantité;
@ManyToOne
private Electrique electrique;

public Materiel() {
	super();
}

public Materiel(Long idMateriel, String nomMateriel, String description, String marque, Double quantité,
		Electrique electrique) {
	super();
	this.idMateriel = idMateriel;
	this.nomMateriel = nomMateriel;
	this.description = description;
	this.marque = marque;
	this.quantité = quantité;
	this.electrique = electrique;
}

public Long getIdMateriel() {
	return idMateriel;
}

public void setIdMateriel(Long idMateriel) {
	this.idMateriel = idMateriel;
}

public String getNomMateriel() {
	return nomMateriel;
}

public void setNomMateriel(String nomMateriel) {
	this.nomMateriel = nomMateriel;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getMarque() {
	return marque;
}

public void setMarque(String marque) {
	this.marque = marque;
}

public Double getQuantité() {
	return quantité;
}

public void setQuantité(Double quantité) {
	this.quantité = quantité;
}

public Electrique getElectrique() {
	return electrique;
}

public void setElectrique(Electrique electrique) {
	this.electrique = electrique;
}

@Override
public String toString() {
	return "Materiel [idMateriel=" + idMateriel + ", nomMateriel=" + nomMateriel + ", description=" + description
			+ ", marque=" + marque + ", quantité=" + quantité + "]";
}



}
