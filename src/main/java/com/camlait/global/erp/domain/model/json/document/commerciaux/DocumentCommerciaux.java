package com.camlait.global.erp.domain.model.json.document.commerciaux;


import com.camlait.global.erp.domain.model.json.document.Document;
import com.camlait.global.erp.domain.model.json.enumeration.TypeDocuments;


public class DocumentCommerciaux extends Document {
    
    public DocumentCommerciaux() {
        setTypeDocument(TypeDocuments.DOCUMENT_COMMERCIAUX);
    }
}
