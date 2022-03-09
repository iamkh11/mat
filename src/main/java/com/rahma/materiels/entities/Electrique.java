package com.rahma.materiels.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Electrique {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idElect;
private String nomElect;
private String descriptionElect;
@JsonIgnore
@OneToMany(mappedBy = "electrique")
private List<Materiel> materiels;

public Electrique() {
	super();
}

public Electrique(Long idElect, String nomElect, String descriptionElect, List<Materiel> materiels) {
	super();
	this.idElect = idElect;
	this.nomElect = nomElect;
	this.descriptionElect = descriptionElect;
	this.materiels = materiels;
}

public Long getIdElect() {
	return idElect;
}

public void setIdElect(Long idElect) {
	this.idElect = idElect;
}

public String getNomElect() {
	return nomElect;
}

public void setNomElect(String nomElect) {
	this.nomElect = nomElect;
}

public String getDescriptionElect() {
	return descriptionElect;
}

public void setDescriptionElect(String descriptionElect) {
	this.descriptionElect = descriptionElect;
}

public List<Materiel> getMateriels() {
	return materiels;
}

public void setMateriels(List<Materiel> materiels) {
	this.materiels = materiels;
}

@Override
public String toString() {
	return "Electrique [idElect=" + idElect + ", nomElect=" + nomElect + ", descriptionElect=" + descriptionElect + "]";
}


}