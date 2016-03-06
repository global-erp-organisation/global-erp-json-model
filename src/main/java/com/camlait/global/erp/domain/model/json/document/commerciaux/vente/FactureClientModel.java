package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import java.util.Collection;

import com.camlait.global.erp.domain.document.commerciaux.vente.FactureClient;
import com.camlait.global.erp.domain.model.json.operation.reglement.lettrage.FactureReglementModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class FactureClientModel extends DocumentDeVenteModel {

	@JsonManagedReference
	private Collection<FactureReglementModel> factureReglementModels;

	public FactureClientModel(FactureClient d) {
		super(d);
	}
}
