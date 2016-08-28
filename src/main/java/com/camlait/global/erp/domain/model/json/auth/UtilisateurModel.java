package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.auth.Utilisateur;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.partenaire.EmployeModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class UtilisateurModel extends Entite {

    private String codeUtilisateur;

    private String courriel;

    private String motDePasse;

    private Date dateDeCreation;

    private Date derniereMiseAJour;

    @JsonManagedReference
    private Collection<EmployeModel> employeModels;

    public UtilisateurModel(Utilisateur u) {
        setCodeUtilisateur(u.getCodeUtilisateur());
        setCodeUtilisateur(u.getCourriel());
        setDateDeCreation(u.getDateDeCreation());
        setDerniereMiseAJour(u.getDerniereMiseAJour());
        setEmployeModels(getEmployes(u));
        setMotDePasse(u.getMotDePasse());
    }

    private Collection<EmployeModel> getEmployes(Utilisateur u) {
        return u.getEmployes().stream().map(e -> {
            return new EmployeModel(e);
        }).collect(Collectors.toList());
    }
}
