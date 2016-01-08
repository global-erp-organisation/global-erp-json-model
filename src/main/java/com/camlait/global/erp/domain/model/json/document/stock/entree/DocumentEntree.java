package com.camlait.global.erp.domain.model.json.document.stock.entree;


import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStock;

public class DocumentEntree extends DocumentDeStock {

	public DocumentEntree() {
		setSensOperation(SensOperation.ENTREE);
		setTypeDocument(TypeDocuments.DOCUMENT_ENTREE);
	}
}
