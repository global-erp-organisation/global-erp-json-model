package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.document.stock.sortie.Echantillon;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class EchantillonModel extends DocumentDeSortieModel {

	public EchantillonModel() {
		setTypeDocument(TypeDocuments.ECHANTILLON);
	}

	public EchantillonModel(Echantillon e) {
		super(e);
	}

}
