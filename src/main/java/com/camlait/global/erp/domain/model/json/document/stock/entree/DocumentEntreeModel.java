package com.camlait.global.erp.domain.model.json.document.stock.entree;


import com.camlait.global.erp.domain.document.stock.entree.DocumentEntree;
import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStockModel;

public class DocumentEntreeModel extends DocumentDeStockModel {

	public DocumentEntreeModel() {
		setSensOperation(SensOperation.ENTREE);
		setTypeDocument(TypeDocuments.DOCUMENT_ENTREE);
	}
	
	public DocumentEntreeModel(DocumentEntree d) {
		super(d);
	}

}
