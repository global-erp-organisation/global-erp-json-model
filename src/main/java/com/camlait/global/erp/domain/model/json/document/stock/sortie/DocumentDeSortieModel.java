package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.document.stock.sortie.DocumentDeSortie;
import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStockModel;

public class DocumentDeSortieModel extends DocumentDeStockModel {

	public DocumentDeSortieModel() {
		setSensOperation(SensOperation.SORTIE);
		setTypeDocument(TypeDocuments.DOCUMENT_SORTIE);
	}

	public DocumentDeSortieModel(DocumentDeSortie d) {
		super(d);
	}
}
