package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.enumeration.TypeDocuments;


public class FactureMarge extends FactureClient {

	public FactureMarge() {
		setTypeDocument(TypeDocuments.FACTURE_MARGE);
	}
}
