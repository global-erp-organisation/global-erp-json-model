package com.camlait.global.erp.domain.model.json.document;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.produit.Produit;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LigneDeDocument extends Entite {
    
    private Long ligneDeDocumentId;
    
     private Produit produit;
    
    private Long quantiteLigne;
    
    private double prixunitaiteLigne;
    
     private Document document;
    
    private Date dateDeCreation;
    
    private Date derniereMiseAJour;
    
     private SensOperation sensOperation;
    
    private Collection<LigneDeDocumentTaxe> ligneDeDocumentTaxes;
    
    public Long getLigneDeDocumentId() {
        return ligneDeDocumentId;
    }
    
    public void setLigneDeDocumentId(Long ligneDeDocumentId) {
        this.ligneDeDocumentId = ligneDeDocumentId;
    }
    
    public Produit getProduit() {
        return produit;
    }
    
    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    public Long getQuantiteLigne() {
        return quantiteLigne;
    }
    
    public void setQuantiteLigne(Long quantiteLigne) {
        this.quantiteLigne = quantiteLigne;
    }
    
    public double getPrixunitaiteLigne() {
        return prixunitaiteLigne;
    }
    
    public void setPrixunitaiteLigne(double prixunitaiteLigne) {
        this.prixunitaiteLigne = prixunitaiteLigne;
    }
    
    public Document getDocument() {
        return document;
    }
    
    public void setDocument(Document document) {
        this.document = document;
    }
    
    public Date getDateDeCreation() {
        return dateDeCreation;
    }
    
    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }
    
    public Date getDerniereMiseAJour() {
        return derniereMiseAJour;
    }
    
    public void setDerniereMiseAJour(Date derniereMiseAJour) {
        this.derniereMiseAJour = derniereMiseAJour;
    }
    
    public SensOperation getSensOperation() {
        return sensOperation;
    }
    
    public void setSensOperation(SensOperation sensOperation) {
        this.sensOperation = sensOperation;
    }
    
    public Collection<LigneDeDocumentTaxe> getLigneDeDocumentTaxes() {
        return ligneDeDocumentTaxes;
    }
    
    public void setLigneDeDocumentTaxes(Collection<LigneDeDocumentTaxe> ligneDeDocumentTaxes) {
        this.ligneDeDocumentTaxes = ligneDeDocumentTaxes;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ligneDeDocumentId == null) ? 0 : ligneDeDocumentId.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LigneDeDocument other = (LigneDeDocument) obj;
        if (ligneDeDocumentId == null) {
            if (other.ligneDeDocumentId != null)
                return false;
        } else if (!ligneDeDocumentId.equals(other.ligneDeDocumentId))
            return false;
        return true;
    }
    
    public LigneDeDocument() {
        setDateDeCreation(new Date());
        setDerniereMiseAJour(new Date());
        
    }
}
