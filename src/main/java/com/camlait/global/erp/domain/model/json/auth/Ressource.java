package com.camlait.global.erp.domain.model.json.auth;

import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Ressource extends Entite {

	private Long ressourceId;
	private String codeRessource;

	private Ressource ressourceParent;

	private String descriptionRessource;

	public Long getRessourceId() {
		return ressourceId;
	}

	public void setRessourceId(Long meduId) {
		this.ressourceId = meduId;
	}

	public String getCodeRessource() {
		return codeRessource;
	}

	public void setCodeRessource(String codeMenu) {
		this.codeRessource = codeMenu;
	}

	public Ressource getRessourceParent() {
		return ressourceParent;
	}

	public void setRessourceParent(Ressource menuParent) {
		this.ressourceParent = menuParent;
	}

	public String getDescriptionRessource() {
		return descriptionRessource;
	}

	public void setDescriptionRessource(String descriptionMenu) {
		this.descriptionRessource = descriptionMenu;
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
		Ressource other = (Ressource) obj;
		if (ressourceId == null) {
			if (other.ressourceId != null)
				return false;
		} else if (!ressourceId.equals(other.ressourceId))
			return false;
		return true;
	}

	public Ressource(String codeMenu, String descriptionMenu) {
		super();
		this.codeRessource = codeMenu;
		this.descriptionRessource = descriptionMenu;
	}

	public Ressource(String codeMenu, String descriptionMenu, Ressource menuParent) {
		super();
		this.codeRessource = codeMenu;
		this.descriptionRessource = descriptionMenu;
		this.ressourceParent = menuParent;
	}
}
