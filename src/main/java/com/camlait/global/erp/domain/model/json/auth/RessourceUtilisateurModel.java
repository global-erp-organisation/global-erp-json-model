package com.camlait.global.erp.domain.model.json.auth;

import java.util.Date;

import com.camlait.global.erp.domain.auth.RessourceUtilisateur;
import com.camlait.global.erp.domain.enumeration.Etat;
import com.camlait.global.erp.domain.model.json.Entite;

public class RessourceUtilisateurModel extends Entite {

	private Long ressourceUtilisateurId;

	private String codeUtilisateur;

	private Long ressourceId;

	private Etat etat;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getRessourceUtilisateurId() {
		return ressourceUtilisateurId;
	}

	public void setRessourceUtilisateurId(Long menuUtilisateurId) {
		this.ressourceUtilisateurId = menuUtilisateurId;
	}

	public Etat getEtat() {
		return etat;
	}

	public String getCodeUtilisateur() {
		return codeUtilisateur;
	}

	public void setCodeUtilisateur(String codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}

	public Long getRessourceId() {
		return ressourceId;
	}

	public void setRessourceId(Long ressourceId) {
		this.ressourceId = ressourceId;
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

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ressourceUtilisateurId == null) ? 0 : ressourceUtilisateurId.hashCode());
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
		RessourceUtilisateurModel other = (RessourceUtilisateurModel) obj;
		if (ressourceUtilisateurId == null) {
			if (other.ressourceUtilisateurId != null)
				return false;
		} else if (!ressourceUtilisateurId.equals(other.ressourceUtilisateurId))
			return false;
		return true;
	}

	public RessourceUtilisateurModel() {
		super();
	}

	public RessourceUtilisateurModel(RessourceUtilisateur ru) {
		setCodeUtilisateur((ru.getUtilisateur() == null) ? null : ru.getUtilisateur().getCodeUtilisateur());
		setDateDeCreation(ru.getDateDeCreation());
		setDerniereMiseAJour(ru.getDerniereMiseAJour());
		setEtat(ru.getEtat());
		setRessourceId((ru.getRessource() == null) ? null : ru.getRessource().getRessourceId());
		setRessourceUtilisateurId(ru.getRessourceUtilisateurId());
	}

}
