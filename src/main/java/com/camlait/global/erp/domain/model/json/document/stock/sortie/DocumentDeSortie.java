package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStock;
import com.camlait.global.erp.domain.model.json.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.enumeration.TypeDocuments;

public class DocumentDeSortie extends DocumentDeStock {

	public DocumentDeSortie() {
		setSensOperation(SensOperation.SORTIE);
		setTypeDocument(TypeDocuments.DOCUMENT_SORTIE);
	}
}
