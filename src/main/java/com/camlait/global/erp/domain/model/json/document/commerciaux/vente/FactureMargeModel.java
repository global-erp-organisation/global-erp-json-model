package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.document.commerciaux.vente.FactureMarge;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class FactureMargeModel extends FactureClientModel {

	public FactureMargeModel() {
		setTypeDocument(TypeDocuments.FACTURE_MARGE);
	}

	public FactureMargeModel(FactureMarge d) {
		super(d);
	}

}
