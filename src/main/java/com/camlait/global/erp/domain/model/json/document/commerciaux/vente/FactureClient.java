package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.operation.reglement.lettrage.FactureReglement;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class FactureClient extends DocumentDeVente {

	private Collection<FactureReglement> factureReglements;

	public Collection<FactureReglement> getFactureReglements() {
		return factureReglements;
	}

	public void setFactureReglements(Collection<FactureReglement> factureReglements) {
		this.factureReglements = factureReglements;
	}


	public FactureClient() {
		setTypeDocument(TypeDocuments.FACTURE_CLIENT);
	}
}
