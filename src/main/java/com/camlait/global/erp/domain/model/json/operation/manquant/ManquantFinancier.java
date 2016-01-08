package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.model.json.operation.Operation;
import com.camlait.global.erp.domain.model.json.partenaire.Vendeur;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class ManquantFinancier extends Operation {

	private Vendeur vendeur;

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}
}
