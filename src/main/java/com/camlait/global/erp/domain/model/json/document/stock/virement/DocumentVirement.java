package com.camlait.global.erp.domain.model.json.document.stock.virement;

import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStock;
import com.camlait.global.erp.domain.model.json.entrepot.Magasin;
import com.camlait.global.erp.domain.model.json.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.enumeration.TypeDocuments;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class DocumentVirement extends DocumentDeStock {
    
    private Magasin magasinDestination;
    
    public Magasin getMagasinDestination() {
        return magasinDestination;
    }
    
    public void setMagasinDestination(Magasin magasinDestination) {
        this.magasinDestination = magasinDestination;
    }
    
    public DocumentVirement() {
        setSensOperation(SensOperation.VIREMENT);
        setTypeDocument(TypeDocuments.TRANSFERT);
    }
}
