package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Date;

import com.camlait.global.erp.domain.enumeration.Sexe;
import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.partenaire.Employe;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class EmployeModel extends PartenaireModel {

	private String matricule;

	private String nom;

	private String prenom;

	private Date dateDeNaissance;

	private String codeUtilisateur;

	private Long emploisId;

	private Sexe sexe;

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getCodeUtilisateur() {
		return codeUtilisateur;
	}

	public void setCodeUtilisateur(String codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}

	public Long getEmploisId() {
		return emploisId;
	}

	public void setEmploisId(Long emploisId) {
		this.emploisId = emploisId;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "[" + matricule + "] " + prenom + " " + nom + "" + sexe.getType();
	}

	public EmployeModel() {
		setTypePartenaire(TypePartenaire.EMPLOYE);
	}

	public EmployeModel(Employe e) {
		super(e);
		setNom(e.getNom());
		setPrenom(e.getPrenom());
		setDateDeNaissance(e.getDateDeNaissance());
		setMatricule(e.getMatricule());
		setSexe(e.getSexe());
		setEmploisId((e.getEmplois()==null)?null:e.getEmplois().getEmploisId());
		setCodeUtilisateur((e.getUtilisateur()==null)?null:e.getUtilisateur().getCodeUtilisateur());
		setTypePartenaire(e.getTypePartenaire());
	}

}
