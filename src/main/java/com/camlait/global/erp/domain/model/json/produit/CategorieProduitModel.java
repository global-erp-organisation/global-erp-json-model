package com.camlait.global.erp.domain.model.json.produit;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.enumeration.Portee;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class CategorieProduitModel extends Entite {
    
    private Long categorieProduitId;
    
    private Long categorieParentId;
    
    private String codeCategorieProduit;
    
    private String descriptionCategorie;
    
    private Portee portee;
    
    private boolean categorieTaxable;
    
    private boolean suiviEnStock;
    
    private Date dateDeCreation;
    
    private Date derniereMiseAJour;
    
    @JsonManagedReference
    private Collection<ProduitModel> produitModels;
    
    private Collection<CategorieProduitTaxeModel> categorieProduitTaxeModels;
    
    public Long getCategorieProduitId() {
        return categorieProduitId;
    }
    
    public void setCategorieProduitId(Long categorieProduitId) {
        this.categorieProduitId = categorieProduitId;
    }
    
    public Long getCategorieParentId() {
        return categorieParentId;
    }
    
    public void setCategorieParentId(Long categorieParentId) {
        this.categorieParentId = categorieParentId;
    }
    
    public String getCodeCategorieProduit() {
        return codeCategorieProduit;
    }
    
    public void setCodeCategorieProduit(String codeCategorieProduit) {
        this.codeCategorieProduit = codeCategorieProduit;
    }
    
    public String getDescriptionCategorie() {
        return descriptionCategorie;
    }
    
    public void setDescriptionCategorie(String descriptionCategorie) {
        this.descriptionCategorie = descriptionCategorie;
    }
    
    public Portee getPortee() {
        return portee;
    }
    
    public void setPortee(Portee portee) {
        this.portee = portee;
    }
    
    public boolean isCategorieTaxable() {
        return categorieTaxable;
    }
    
    public void setCategorieTaxable(boolean categorieTaxable) {
        this.categorieTaxable = categorieTaxable;
    }
    
    public Collection<ProduitModel> getProduits() {
        return produitModels;
    }
    
    public void setProduits(Collection<ProduitModel> produitModels) {
        this.produitModels = produitModels;
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
    
    public Collection<CategorieProduitTaxeModel> getCategorieProduitTaxes() {
        return categorieProduitTaxeModels;
    }
    
    public void setCategorieProduitTaxes(Collection<CategorieProduitTaxeModel> categorieProduitTaxeModels) {
        this.categorieProduitTaxeModels = categorieProduitTaxeModels;
    }
    
    public boolean isSuiviEnStock() {
        return suiviEnStock;
    }
    
    public void setSuiviEnStock(boolean suiviEnStock) {
        this.suiviEnStock = suiviEnStock;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categorieProduitId == null) ? 0 : categorieProduitId.hashCode());
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
        CategorieProduitModel other = (CategorieProduitModel) obj;
        if (categorieProduitId == null) {
            if (other.categorieProduitId != null)
                return false;
        } else if (!categorieProduitId.equals(other.categorieProduitId))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "[" + categorieProduitId + "]-[" + codeCategorieProduit + "] " + descriptionCategorie;
    }
    
    public CategorieProduitModel() {
    }
    
    public CategorieProduitModel(CategorieProduit c) {
        setCategorieParentId(c.getCategorieParent().getCategorieProduitId());
        setCategorieProduitId(c.getCategorieProduitId());
        setCategorieProduitTaxes(getTaxes(c));
        setCategorieTaxable(c.isCategorieTaxable());
        setCodeCategorieProduit(c.getCodeCategorieProduit());
        setDateDeCreation(c.getDateDeCreation());
        setDerniereMiseAJour(c.getDerniereMiseAJour());
        setDescriptionCategorie(c.getDescriptionCategorie());
        setPortee(c.getPortee());
        setProduits(getProduitModels(c));
        setSuiviEnStock(c.isSuiviEnStock());
    }
    
    private Collection<CategorieProduitTaxeModel> getTaxes(CategorieProduit c) {
        Collection<CategorieProduitTaxeModel> taxes = new HashSet<>();
        c.getCategorieProduitTaxes().stream().forEach(t -> {
            CategorieProduitTaxeModel m = new CategorieProduitTaxeModel();
            m.setDateDeCreation(t.getDateDeCreation());
            m.setDerniereMiseAJour(m.getDerniereMiseAJour());
            m.setCategorieId(c.getCategorieProduitId());
            m.setCategorieProduitTaxeId(t.getCategorieProduitTaxeId());
            m.setTaxeId(t.getTaxe().getTaxeId());
        });
        return taxes;
    }
    
    private Collection<ProduitModel> getProduitModels(CategorieProduit c) {
        Collection<ProduitModel> pms = new HashSet<>();
        c.getProduits().stream().forEach(p -> {
            pms.add(new ProduitModel(p));
        });
        return pms;
    }
}
