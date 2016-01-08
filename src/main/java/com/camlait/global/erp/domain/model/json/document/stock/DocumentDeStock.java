package com.camlait.global.erp.domain.model.json.document.stock;

import com.camlait.global.erp.domain.model.json.document.Document;
import com.camlait.global.erp.domain.model.json.enumeration.TypeDocuments;

public class DocumentDeStock extends Document {

	public DocumentDeStock() {
		setTypeDocument(TypeDocuments.DOCUMENT_DE_STOCK);
	}

}
