package com.camlait.global.erp.domain.model.json.document.commerciaux;


import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.Document;


public class DocumentCommerciaux extends Document {
    
    public DocumentCommerciaux() {
        setTypeDocument(TypeDocuments.DOCUMENT_COMMERCIAUX);
    }
}
