package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.enumeration.TypeDocuments;


public class FactureClientComptant extends FactureClient {

	public FactureClientComptant() {
		setTypeDocument(TypeDocuments.FACTURE_COMPTANT);
	}
}
