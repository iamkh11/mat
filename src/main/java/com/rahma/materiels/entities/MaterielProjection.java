package com.rahma.materiels.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection (name = "nomMat", types = { Materiel.class })
public interface MaterielProjection {
public String getNomMateriel();
}