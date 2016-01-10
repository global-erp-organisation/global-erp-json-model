package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.document.stock.sortie.Don;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class DonModel extends DocumentDeSortieModel {

	public DonModel() {
		setTypeDocument(TypeDocuments.DON);
	}
	
	public DonModel(Don d) {
		super(d);
	}

}
