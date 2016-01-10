package com.camlait.global.erp.domain.model.json.immobilisation;

import com.camlait.global.erp.domain.immobilisation.Vehicule;

public class VehiculeModel extends ImmobilisationModel {

	private String immatriculation;

	private String marque;

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public VehiculeModel() {

	}

	public VehiculeModel(Vehicule v) {
		super(v);
		setImmatriculation(v.getImmatriculation());
		setMarque(v.getMarque());
	}
}
