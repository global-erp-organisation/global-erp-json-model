package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Date;

import com.camlait.global.erp.domain.enumeration.Sexe;
import com.camlait.global.erp.domain.partenaire.Employe;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class EmployeModel extends PartenaireModel {

	private String matricule;

	private String nom;

	private String prenom;

	private Date dateDeNaissance;

	private String codeUtilisateur;

	private Long emploisId;

	private Sexe sexe;

	public EmployeModel(Employe e) {
		super(e);
		setNom(e.getNom());
		setPrenom(e.getPrenom());
		setDateDeNaissance(e.getDateDeNaissance());
		setMatricule(e.getMatricule());
		setSexe(e.getSexe());
		setEmploisId((e.getEmplois() == null) ? null : e.getEmplois().getEmploisId());
		setCodeUtilisateur((e.getUtilisateur() == null) ? null : e.getUtilisateur().getCodeUtilisateur());
		setTypePartenaire(e.getTypePartenaire());
	}

}
