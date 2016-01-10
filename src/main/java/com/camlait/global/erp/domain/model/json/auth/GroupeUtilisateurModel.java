package com.camlait.global.erp.domain.model.json.auth;

import java.util.Date;

import com.camlait.global.erp.domain.auth.GroupeUtilisateur;
import com.camlait.global.erp.domain.model.json.Entite;

public class GroupeUtilisateurModel extends Entite {

	private Long groupeUtilissateurId;
	private Long groupeId;

	private String codeUtilisateur;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getGroupeUtilissateurId() {
		return groupeUtilissateurId;
	}

	public void setGroupeUtilissateurId(Long groupeUtilissateurId) {
		this.groupeUtilissateurId = groupeUtilissateurId;
	}

	public Long getGroupeId() {
		return groupeId;
	}

	public void setGroupeId(Long groupeId) {
		this.groupeId = groupeId;
	}

	public String getCodeUtilisateur() {
		return codeUtilisateur;
	}

	public void setCodeUtilisateur(String codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupeUtilissateurId == null) ? 0 : groupeUtilissateurId.hashCode());
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
		GroupeUtilisateurModel other = (GroupeUtilisateurModel) obj;
		if (groupeUtilissateurId == null) {
			if (other.groupeUtilissateurId != null)
				return false;
		} else if (!groupeUtilissateurId.equals(other.groupeUtilissateurId))
			return false;
		return true;
	}

	public GroupeUtilisateurModel() {
		super();
	}

	public GroupeUtilisateurModel(GroupeUtilisateur gu) {
		setDateDeCreation(gu.getDateDeCreation());
		setDerniereMiseAJour(gu.getDerniereMiseAJour());
		setGroupeId((gu.getGroupe() == null) ? null : gu.getGroupe().getGroupeId());
		setGroupeUtilissateurId(gu.getGroupeUtilissateurId());
		setCodeUtilisateur((gu.getUtilsateur() == null) ? null : gu.getUtilsateur().getCodeUtilisateur());
	}

}
