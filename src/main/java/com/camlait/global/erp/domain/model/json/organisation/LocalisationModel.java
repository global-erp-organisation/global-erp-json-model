package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Date;

import com.camlait.global.erp.domain.enumeration.AutreEnum;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.organisation.Localisation;

public class LocalisationModel extends Entite {

	private Long localId;

	private String code;

	private String descriptionLocal;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private AutreEnum typeLocal;

	public Long getLocalId() {
		return localId;
	}

	public void setLocalId(Long localId) {
		this.localId = localId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescriptionLocal() {
		return descriptionLocal;
	}

	public void setDescriptionLocal(String descriptionLocal) {
		this.descriptionLocal = descriptionLocal;
	}

	public AutreEnum getTypeLocal() {
		return typeLocal;
	}

	public void setTypeLocal(AutreEnum typeLocal) {
		this.typeLocal = typeLocal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((localId == null) ? 0 : localId.hashCode());
		return result;
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocalisationModel other = (LocalisationModel) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (localId == null) {
			if (other.localId != null)
				return false;
		} else if (!localId.equals(other.localId))
			return false;
		return true;
	}

	public LocalisationModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public LocalisationModel(Localisation l) {
		setTypeLocal(l.getTypeLocal());
		setCode(l.getCode());
		setDateDeCreation(l.getDateDeCreation());
		setDerniereMiseAJour(l.getDerniereMiseAJour());
		setDescriptionLocal(l.getDescriptionLocal());
		setLocalId(l.getLocalId());
	}
}
