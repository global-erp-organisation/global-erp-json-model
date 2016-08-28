package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVenteModel;
import com.camlait.global.erp.domain.model.json.immobilisation.PartenaireImmobilisationModel;
import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.partenaire.Partenaire;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class PartenaireModel extends Entite {

    private Long partenaireId;

    private String codePartenaire;

    private String adresse;

    private String telephone;

    private Date dateDeCreation;

    private Date derniereMiseAJour;

    private TypePartenaire typePartenaire;

    private Long centreId;

    @JsonManagedReference
    private Collection<DocumentDeVenteModel> documents;

    @JsonManagedReference
    private Collection<PartenaireImmobilisationModel> partenaireImmobilisationModels;

    @JsonManagedReference
    private Collection<OperationModel> operationModels;

    public PartenaireModel(Partenaire p) {
        setAdresse(p.getAdresse());
        setCentreId((p.getCentre() == null) ? null : p.getCentre().getLocalId());
        setCodePartenaire(p.getCodePartenaire());
        setDateDeCreation(p.getDateDeCreation());
        setDerniereMiseAJour(p.getDerniereMiseAJour());
        setDocuments(getDocuments(p));
        setTypePartenaire(p.getTypePartenaire());
        setTelephone(p.getTelephone());
        setOperationModels(getOperations(p));
        setPartenaireId(p.getPartenaireId());
        setPartenaireImmobilisationModels(getImmos(p));
    }

    private Collection<DocumentDeVenteModel> getDocuments(Partenaire p) {
        Collection<DocumentDeVenteModel> ds = new HashSet<>();
        p.getDocuments().stream().forEach(d -> {
            ds.add(new DocumentDeVenteModel(d));
        });
        return ds;
    }

    private Collection<OperationModel> getOperations(Partenaire p) {
        return p.getOperations().stream().map(o -> {
            return new OperationModel(o);
        }).collect(Collectors.toList());
    }

    private Collection<PartenaireImmobilisationModel> getImmos(Partenaire p) {
        return p.getPartenaireImmobilisations().stream().map(i -> {
            return new PartenaireImmobilisationModel(i);
        }).collect(Collectors.toList());
    }
}
