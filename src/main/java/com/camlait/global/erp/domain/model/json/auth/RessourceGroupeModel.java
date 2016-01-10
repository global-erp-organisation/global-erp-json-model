package com.camlait.global.erp.domain.model.json.auth;

import java.util.Date;

import com.camlait.global.erp.domain.auth.RessourceGroupe;
import com.camlait.global.erp.domain.model.json.Entite;

public class RessourceGroupeModel extends Entite {

	private Long resourceGroupeId;

	private Long groupeId;

	private Long ressourceId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getResourceGroupeId() {
		return resourceGroupeId;
	}

	public void setResourceGroupeId(Long resourceGroupeId) {
		this.resourceGroupeId = resourceGroupeId;
	}

	public Long getGroupeId() {
		return groupeId;
	}

	public void setGroupeId(Long groupeId) {
		this.groupeId = groupeId;
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
		RessourceGroupeModel other = (RessourceGroupeModel) obj;
		if (resourceGroupeId == null) {
			if (other.resourceGroupeId != null)
				return false;
		} else if (!resourceGroupeId.equals(other.resourceGroupeId))
			return false;
		return true;
	}

	public RessourceGroupeModel() {
		super();
	}

	public RessourceGroupeModel(RessourceGroupe rg) {
		setDateDeCreation(rg.getDateDeCreation());
		setDerniereMiseAJour(rg.getDerniereMiseAJour());
		setGroupeId(rg.getGroupe().getGroupeId());
		setResourceGroupeId(rg.getResourceGroupeId());
		setRessourceId((rg.getRessource() == null) ? null : rg.getRessource().getRessourceId());
	}
}
