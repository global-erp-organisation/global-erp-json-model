package com.camlait.global.erp.domain.model.json.inventaire;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.inventaire.Inventaire;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.DocumentModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class InventaireModel extends Entite {

    private Long inventaireId;

    private String codeInventaire;

    private Date dateInventaire;

    private String note;

    private Long magasinId;

    private Long magasinierSortantId;

    private Long magasinierEntrantId;

    private boolean inventaireClos;

    @JsonManagedReference
    private Collection<DocumentModel> documentModels;

    @JsonManagedReference
    private Collection<LigneInventaireModel> ligneInventaireModels;

    private Date dateDeCreation;

    private Date derniereMiseAJour;

    public InventaireModel(Inventaire i) {
        setCodeInventaire(i.getCodeInventaire());
        setDateDeCreation(i.getDateDeCreation());
        setDerniereMiseAJour(i.getDerniereMiseAJour());
        setDateInventaire(i.getDateInventaire());
        setDocumentModels(getDocuments(i));
        setInventaireClos(i.isInventaireClos());
        setInventaireId(i.getInventaireId());
        setLigneInventaireModels(getLigneInventaires(i));
        setMagasinId((i.getMagasin() == null) ? null : i.getMagasin().getMagasinId());
        setMagasinierEntrantId((i.getMagasinierEntrant() == null) ? null : i.getMagasinierEntrant().getPartenaireId());
        setMagasinierSortantId((i.getMagasinierSortant() == null) ? null : i.getMagasinierSortant().getPartenaireId());
        setNote(i.getNote());
    }

    private Collection<DocumentModel> getDocuments(Inventaire i) {
        return i.getDocuments().stream().map(d -> {
            return new DocumentModel(d);
        }).collect(Collectors.toList());
    }

    private Collection<LigneInventaireModel> getLigneInventaires(Inventaire i) {
        return i.getLigneInventaires().stream().map(l -> {
            return new LigneInventaireModel(l);
        }).collect(Collectors.toList());
    }

}
