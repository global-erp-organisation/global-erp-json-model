package com.camlait.global.erp.domain.model.json.document;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.commerciaux.TaxeModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LigneDeDocumentTaxe extends Entite {
    private Long ligneDeDocumentTaxeId;
    
    private LigneDeDocument ligneDeDocument;
    
    private TaxeModel taxeModel;
    
    private double tauxDeTaxe;
    
    private Date dateDeCreation;
    
    private Date derniereMiseAJour;
    
    public LigneDeDocument getLigneDeDocument() {
        return ligneDeDocument;
    }
    
    public void setLigneDeDocument(LigneDeDocument ligneDeDocument) {
        this.ligneDeDocument = ligneDeDocument;
    }
    
    public TaxeModel getTaxe() {
        return taxeModel;
    }
    
    public void setTaxe(TaxeModel taxeModel) {
        this.taxeModel = taxeModel;
    }
    
    public double getTauxDeTaxe() {
        return tauxDeTaxe;
    }
    
    public void setTauxDeTaxe(double tauxDeTaxe) {
        this.tauxDeTaxe = tauxDeTaxe;
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
    
    public Long getLigneDeDocumentTaxeId() {
        return ligneDeDocumentTaxeId;
    }
    
    public void setLigneDeDocumentTaxeId(Long ligneDeDocumentTaxeId) {
        this.ligneDeDocumentTaxeId = ligneDeDocumentTaxeId;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ligneDeDocumentTaxeId == null) ? 0 : ligneDeDocumentTaxeId.hashCode());
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
        LigneDeDocumentTaxe other = (LigneDeDocumentTaxe) obj;
        if (ligneDeDocumentTaxeId == null) {
            if (other.ligneDeDocumentTaxeId != null)
                return false;
        } else if (!ligneDeDocumentTaxeId.equals(other.ligneDeDocumentTaxeId))
            return false;
        return true;
    }

    public LigneDeDocumentTaxe() {
        setDateDeCreation(new Date());
        setDerniereMiseAJour(new Date());
    }
    
}
