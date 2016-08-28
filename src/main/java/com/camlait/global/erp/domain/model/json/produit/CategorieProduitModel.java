package com.camlait.global.erp.domain.model.json.produit;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.enumeration.Portee;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
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

    public CategorieProduitModel(CategorieProduit c) {
        setCategorieParentId((c.getCategorieParent() == null) ? null : c.getCategorieParent().getCategorieProduitId());
        setCategorieProduitId(c.getCategorieProduitId());
        setCategorieProduitTaxeModels(getTaxes(c));
        setCategorieTaxable(c.isCategorieTaxable());
        setCodeCategorieProduit(c.getCodeCategorieProduit());
        setDateDeCreation(c.getDateDeCreation());
        setDerniereMiseAJour(c.getDerniereMiseAJour());
        setDescriptionCategorie(c.getDescriptionCategorie());
        setPortee(c.getPortee());
        setProduitModels(getProduitModels(c));
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
        return c.getProduits().stream().map(p -> {
            return new ProduitModel(p);
        }).collect(Collectors.toList());
    }
}
