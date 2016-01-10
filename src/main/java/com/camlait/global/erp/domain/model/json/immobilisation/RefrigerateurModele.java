package com.camlait.global.erp.domain.model.json.immobilisation;

import com.camlait.global.erp.domain.immobilisation.Refrigerateur;

public class RefrigerateurModele extends ImmobilisationModel {

	private String numeroDeSerie;

	private String marque;

	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public RefrigerateurModele() {

	}

	public RefrigerateurModele(Refrigerateur r) {
		super(r);
		setNumeroDeSerie(r.getNumeroDeSerie());
		setMarque(r.getMarque());
	}
}
