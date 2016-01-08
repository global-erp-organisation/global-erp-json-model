package com.camlait.global.erp.domain.model.json.document.stock.entree;


import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStock;
import com.camlait.global.erp.domain.model.json.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.enumeration.TypeDocuments;

public class DocumentEntree extends DocumentDeStock {

	public DocumentEntree() {
		setSensOperation(SensOperation.ENTREE);
		setTypeDocument(TypeDocuments.DOCUMENT_ENTREE);
	}
}
