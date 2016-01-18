package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.auth.Ressource;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class RessourceModel extends Entite {

	private Long ressourceId;
	private Long ressourceParentId;

	private String descriptionRessource;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private String classeIcon;

	private String appLocalisation;

	@JsonManagedReference
	private Collection<Ressource> ressourceFils;

	private boolean possedeDesFils;

	public Long getRessourceId() {
		return ressourceId;
	}

	public void setRessourceId(Long meduId) {
		this.ressourceId = meduId;
	}

	public Long getRessourceParentId() {
		return ressourceParentId;
	}

	public void setRessourceParentId(Long ressourceParentId) {
		this.ressourceParentId = ressourceParentId;
	}

	public String getDescriptionRessource() {
		return descriptionRessource;
	}

	public void setDescriptionRessource(String descriptionMenu) {
		this.descriptionRessource = descriptionMenu;
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

	public String getClasseIcon() {
		return classeIcon;
	}

	public void setClasseIcon(String classeIcon) {
		this.classeIcon = classeIcon;
	}

	public String getAppLocalisation() {
		return appLocalisation;
	}

	public void setAppLocalisation(String appLocalisation) {
		this.appLocalisation = appLocalisation;
	}

	public Collection<Ressource> getRessourceFils() {
		return ressourceFils;
	}

	public void setRessourceFils(Collection<Ressource> ressourceFils) {
		this.ressourceFils = ressourceFils;
	}

	public boolean isPossedeDesFils() {
		return possedeDesFils;
	}

	public void setPossedeDesFils(boolean possedeDesFils) {
		this.possedeDesFils = possedeDesFils;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ressourceId == null) ? 0 : ressourceId.hashCode());
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
		RessourceModel other = (RessourceModel) obj;
		if (ressourceId == null) {
			if (other.ressourceId != null)
				return false;
		} else if (!ressourceId.equals(other.ressourceId))
			return false;
		return true;
	}

	public RessourceModel() {
	}

	public RessourceModel(Ressource r) {
		setDateDeCreation(r.getDateDeCreation());
		setDerniereMiseAJour(r.getDerniereMiseAJour());
		setDescriptionRessource(r.getDescriptionRessource());
		setRessourceId(r.getRessourceId());
		setRessourceParentId((r.getRessourceParent() == null) ? null : r.getRessourceParent().getRessourceId());
		setAppLocalisation(r.getAppLocalisation());
		setClasseIcon(r.getClasseIcon());
		setRessourceFils(r.getRessourceFilles());
		setPossedeDesFils(!ressourceFils.isEmpty());
	}
}
