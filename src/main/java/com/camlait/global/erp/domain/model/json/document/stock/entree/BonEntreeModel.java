package com.camlait.global.erp.domain.model.json.document.stock.entree;

import com.camlait.global.erp.domain.document.stock.entree.BonEntree;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class BonEntreeModel extends DocumentEntreeModel {
	public BonEntreeModel() {
		setTypeDocument(TypeDocuments.BON_ENTREE);
	}

	public BonEntreeModel(BonEntree b) {
		super(b);
	}

}
