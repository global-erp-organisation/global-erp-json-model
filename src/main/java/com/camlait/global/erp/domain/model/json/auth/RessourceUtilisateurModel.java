package com.camlait.global.erp.domain.model.json.auth;

import com.camlait.global.erp.domain.enumeration.Etat;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class RessourceUtilisateurModel extends Entite {

	private Long ressourceUtilisateurId;

	private UtilisateurModel utilisateurModel;

	private RessourceModel ressourceModel;

	private Etat etat;

	public Long getRessourceUtilisateurId() {
		return ressourceUtilisateurId;
	}

	public void setRessourceUtilisateurId(Long menuUtilisateurId) {
		this.ressourceUtilisateurId = menuUtilisateurId;
	}

	public UtilisateurModel getUtilisateur() {
		return utilisateurModel;
	}

	public void setUtilisateur(UtilisateurModel utilisateurModel) {
		this.utilisateurModel = utilisateurModel;
	}

	public RessourceModel getRessource() {
		return ressourceModel;
	}

	public void setRessource(RessourceModel ressourceModel) {
		this.ressourceModel = ressourceModel;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public RessourceUtilisateurModel(UtilisateurModel utilisateurModel, RessourceModel ressourceModel, Etat etat) {
		super();
		this.utilisateurModel = utilisateurModel;
		this.ressourceModel = ressourceModel;
		this.etat = etat;
	}

	public RessourceUtilisateurModel() {
		super();
	}
}
