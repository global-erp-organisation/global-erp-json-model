package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStock;

public class DocumentDeSortie extends DocumentDeStock {

	public DocumentDeSortie() {
		setSensOperation(SensOperation.SORTIE);
		setTypeDocument(TypeDocuments.DOCUMENT_SORTIE);
	}
}
