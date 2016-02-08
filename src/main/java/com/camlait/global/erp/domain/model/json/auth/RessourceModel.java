package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.auth.Ressource;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class RessourceModel extends Entite {

	private Long ressourceId;
	private Long ressourceParentId;

	private String title;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private String icon;

	private String sref;

	private String href;

	@JsonManagedReference
	private Collection<Ressource> items;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String descriptionMenu) {
		this.title = descriptionMenu;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String classeIcon) {
		this.icon = classeIcon;
	}

	public String getSref() {
		return sref;
	}

	public void setSref(String appLocalisation) {
		this.sref = appLocalisation;
	}

	public Collection<Ressource> getItems() {
		return items;
	}

	public void setItems(Collection<Ressource> ressourceFils) {
		this.items = ressourceFils;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
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
		setTitle(r.getTitle());
		setRessourceId(r.getRessourceId());
		setRessourceParentId((r.getRessourceParent() == null) ? null : r.getRessourceParent().getRessourceId());
		setSref(r.getSref());
		setIcon(r.getIcon());
		setItems(r.getItems());
		setHref(r.getHref());
	}
}
