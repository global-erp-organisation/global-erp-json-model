package com.camlait.global.erp.domain.model.json.document;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.document.LigneDeDocument;
import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class LigneDeDocumentModel extends Entite {

    private Long ligneDeDocumentId;

    private Long produitId;

    private Long quantiteLigne;

    private double prixunitaiteLigne;

    private Long documentId;

    private Date dateDeCreation;

    private Date derniereMiseAJour;

    private SensOperation sensOperation;

    @JsonManagedReference
    private Collection<LigneDeDocumentTaxeModel> ligneDeDocumentTaxeModels;

    public LigneDeDocumentModel(LigneDeDocument l) {
        setDateDeCreation(l.getDateDeCreation());
        setDerniereMiseAJour(l.getDerniereMiseAJour());
        setDocumentId((l.getDocument() == null) ? null : l.getDocument().getDocumentId());
        setLigneDeDocumentId(l.getLigneDeDocumentId());
        setLigneDeDocumentTaxeModels(getTaxe(l));
        setPrixunitaiteLigne(l.getPrixunitaiteLigne());
        setProduitId((l.getProduit() == null) ? null : l.getProduit().getProduitId());
        setQuantiteLigne(l.getQuantiteLigne());
        setSensOperation(l.getSensOperation());
    }

    private Collection<LigneDeDocumentTaxeModel> getTaxe(LigneDeDocument l) {
        return l.getLigneDeDocumentTaxes().stream().map(t -> {
            return new LigneDeDocumentTaxeModel(t);
        }).collect(Collectors.toList());
    }

}
