package com.camlait.global.erp.domain.model.json.document.stock.sortie;


import com.camlait.global.erp.domain.document.stock.sortie.Avarie;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class AvarieModel extends DocumentDeSortieModel {

	public AvarieModel() {
		setTypeDocument(TypeDocuments.AVARIE);
	}
	
	public AvarieModel(Avarie a) {
		super(a);
	}

}
