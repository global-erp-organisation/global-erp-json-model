package com.camlait.global.erp.domain.model.json.document.stock;

import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.Document;

public class DocumentDeStock extends Document {

	public DocumentDeStock() {
		setTypeDocument(TypeDocuments.DOCUMENT_DE_STOCK);
	}

}
