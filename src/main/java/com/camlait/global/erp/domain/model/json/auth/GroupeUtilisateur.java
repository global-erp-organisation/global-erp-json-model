package com.camlait.global.erp.domain.model.json.auth;

import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class GroupeUtilisateur extends Entite {

	private Long groupeUtilissateurId;
	private Groupe groupe;

	private Utilisateur utilsateur;

	public Long getGroupeUtilissateurId() {
		return groupeUtilissateurId;
	}

	public void setGroupeUtilissateurId(Long groupeUtilissateurId) {
		this.groupeUtilissateurId = groupeUtilissateurId;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Utilisateur getUtilsateur() {
		return utilsateur;
	}

	public void setUtilsateur(Utilisateur utilsateur) {
		this.utilsateur = utilsateur;
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
		GroupeUtilisateur other = (GroupeUtilisateur) obj;
		if (groupeUtilissateurId == null) {
			if (other.groupeUtilissateurId != null)
				return false;
		} else if (!groupeUtilissateurId.equals(other.groupeUtilissateurId))
			return false;
		return true;
	}

	public GroupeUtilisateur() {
		super();
	}
}
