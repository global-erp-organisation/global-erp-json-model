package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Date;

import com.camlait.global.erp.domain.enumeration.Sexe;
import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.auth.UtilisateurModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Employe extends Partenaire {

	private String matricule;

	private String nom;

	private String prenom;

	private Date dateDeNaissance;

	private UtilisateurModel utilisateurModel;

	private Emplois emplois;

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

	public UtilisateurModel getUtilisateur() {
		return utilisateurModel;
	}

	public void setUtilisateur(UtilisateurModel utilisateurModel) {
		this.utilisateurModel = utilisateurModel;
	}

	public Emplois getEmplois() {
		return emplois;
	}

	public void setEmplois(Emplois emplois) {
		this.emplois = emplois;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "[" + matricule + "] " + prenom + " " + nom + "" + sexe.getType() + " "
				+ emplois.getDescriptionEmplois();
	}

	public Employe() {
		setTypePartenaire(TypePartenaire.EMPLOYE);
	}
}
