package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.auth.Groupe;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class GroupeModel extends Entite {

	private Long groupeId;

	private String descriptionGroupe;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	@JsonManagedReference
	private Collection<GroupeUtilisateurModel> groupeUtilisateurModels;

	public Long getGroupeId() {
		return groupeId;
	}

	public void setGroupeId(Long groupeId) {
		this.groupeId = groupeId;
	}

	public String getDescriptionGroupe() {
		return descriptionGroupe;
	}

	public void setDescriptionGroupe(String descriptionGroupe) {
		this.descriptionGroupe = descriptionGroupe;
	}

	public Collection<GroupeUtilisateurModel> getGroupeUtilisateurs() {
		return groupeUtilisateurModels;
	}

	public void setGroupeUtilisateurs(Collection<GroupeUtilisateurModel> groupeUtilisateurModels) {
		this.groupeUtilisateurModels = groupeUtilisateurModels;
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
		result = prime * result + ((groupeId == null) ? 0 : groupeId.hashCode());
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
		GroupeModel other = (GroupeModel) obj;
		if (groupeId == null) {
			if (other.groupeId != null)
				return false;
		} else if (!groupeId.equals(other.groupeId))
			return false;
		return true;
	}

	public GroupeModel() {
		super();
	}

	public GroupeModel(Groupe g) {
		setDescriptionGroupe(g.getDescriptionGroupe());
		setGroupeId(g.getGroupeId());
		setDateDeCreation(g.getDateDeCreation());
		setDerniereMiseAJour(g.getDerniereMiseAJour());
		setGroupeUtilisateurs(getGu(g));
	}

	private Collection<GroupeUtilisateurModel> getGu(Groupe g) {
		final Collection<GroupeUtilisateurModel> gus = new HashSet<>();
		g.getGroupeUtilisateurs().stream().forEach(gu -> {
			gus.add(new GroupeUtilisateurModel(gu));
		});
		return gus;
	}

}