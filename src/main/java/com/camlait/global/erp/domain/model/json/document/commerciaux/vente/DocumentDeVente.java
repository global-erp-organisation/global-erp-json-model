package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.commerciaux.DocumentCommerciaux;
import com.camlait.global.erp.domain.model.json.organisation.Zone;
import com.camlait.global.erp.domain.model.json.partenaire.Client;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public abstract class DocumentDeVente extends DocumentCommerciaux {
    
     private Client client;
    
    private Zone zone;
    
    private boolean documentSolde;
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public boolean isDocumentSolde() {
        return documentSolde;
    }
    
    public void setDocumentSolde(boolean documentSolde) {
        this.documentSolde = documentSolde;
    }
    
    public Zone getZone() {
        return zone;
    }
    
    public void setZone(Zone zone) {
        this.zone = zone;
    }
    
    public DocumentDeVente() {
        setSensOperation(SensOperation.SORTIE);
        setTypeDocument(TypeDocuments.DOCUMENT_DE_VENTE);
    }    
}
