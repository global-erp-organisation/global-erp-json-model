package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import java.util.Collection;

import com.camlait.global.erp.domain.document.commerciaux.vente.FactureClient;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.operation.reglement.lettrage.FactureReglementModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class FactureClientModel extends DocumentDeVenteModel {

	@JsonManagedReference
	private Collection<FactureReglementModel> factureReglementModels;

	@JsonManagedReference
	public Collection<FactureReglementModel> getFactureReglements() {
		return factureReglementModels;
	}

	public void setFactureReglements(Collection<FactureReglementModel> factureReglementModels) {
		this.factureReglementModels = factureReglementModels;
	}

	public FactureClientModel() {
		setTypeDocument(TypeDocuments.FACTURE_CLIENT);
	}

	public FactureClientModel(FactureClient d) {
		super(d);
	}
}
