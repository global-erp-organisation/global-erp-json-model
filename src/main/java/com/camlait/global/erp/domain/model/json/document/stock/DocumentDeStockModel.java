package com.camlait.global.erp.domain.model.json.document.stock;

import com.camlait.global.erp.domain.document.stock.DocumentDeStock;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.DocumentModel;

public class DocumentDeStockModel extends DocumentModel {

	public DocumentDeStockModel() {
		setTypeDocument(TypeDocuments.DOCUMENT_DE_STOCK);
	}

	public DocumentDeStockModel(DocumentDeStock d) {
		super(d);
	}

}
