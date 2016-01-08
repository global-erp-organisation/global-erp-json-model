package com.camlait.global.erp.domain.model.json.auth;

import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class RessourceGroupe extends Entite {

	private Long resourceGroupeId;

	private Groupe groupe;

	private Ressource ressource;

	public Long getResourceGroupeId() {
		return resourceGroupeId;
	}

	public void setResourceGroupeId(Long resourceGroupeId) {
		this.resourceGroupeId = resourceGroupeId;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Ressource getRessource() {
		return ressource;
	}

	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((resourceGroupeId == null) ? 0 : resourceGroupeId.hashCode());
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
		RessourceGroupe other = (RessourceGroupe) obj;
		if (resourceGroupeId == null) {
			if (other.resourceGroupeId != null)
				return false;
		} else if (!resourceGroupeId.equals(other.resourceGroupeId))
			return false;
		return true;
	}

	public RessourceGroupe() {
		super();
	}
}
