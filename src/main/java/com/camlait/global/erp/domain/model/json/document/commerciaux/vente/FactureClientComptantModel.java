package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.document.commerciaux.vente.FactureClientComptant;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class FactureClientComptantModel extends FactureClientModel {

	public FactureClientComptantModel() {
		setTypeDocument(TypeDocuments.FACTURE_COMPTANT);
	}

	public FactureClientComptantModel(FactureClientComptant d) {
		super(d);
	}
}
