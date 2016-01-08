package com.camlait.global.erp.domain.model.json.auth;

import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class RessourceGroupeModel extends Entite {

	private Long resourceGroupeId;

	private GroupeModel groupeModel;

	private RessourceModel ressourceModel;

	public Long getResourceGroupeId() {
		return resourceGroupeId;
	}

	public void setResourceGroupeId(Long resourceGroupeId) {
		this.resourceGroupeId = resourceGroupeId;
	}

	public GroupeModel getGroupe() {
		return groupeModel;
	}

	public void setGroupe(GroupeModel groupeModel) {
		this.groupeModel = groupeModel;
	}

	public RessourceModel getRessource() {
		return ressourceModel;
	}

	public void setRessource(RessourceModel ressourceModel) {
		this.ressourceModel = ressourceModel;
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
}
