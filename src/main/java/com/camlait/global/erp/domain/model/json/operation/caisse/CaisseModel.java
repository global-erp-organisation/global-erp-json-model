package com.camlait.global.erp.domain.model.json.operation.caisse;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.caisse.Caisse;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class CaisseModel extends Entite {
	private Long caisseId;

	private String codeCaisse;

	private String descriptionCaisse;

	private Long responsableId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public String getCodeCaisse() {
		return codeCaisse;
	}

	public void setCodeCaisse(String codeCaisse) {
		this.codeCaisse = codeCaisse;
	}

	public String getDescriptionCaisse() {
		return descriptionCaisse;
	}

	public void setDescriptionCaisse(String descriptionCaisse) {
		this.descriptionCaisse = descriptionCaisse;
	}

	public Long getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(Long responsableId) {
		this.responsableId = responsableId;
	}

	public Long getCaisseId() {
		return caisseId;
	}

	public void setCaisseId(Long id) {
		this.caisseId = id;
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
		result = prime * result + ((caisseId == null) ? 0 : caisseId.hashCode());
		result = prime * result + ((codeCaisse == null) ? 0 : codeCaisse.hashCode());
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
		CaisseModel other = (CaisseModel) obj;
		if (caisseId == null) {
			if (other.caisseId != null)
				return false;
		} else if (!caisseId.equals(other.caisseId))
			return false;
		if (codeCaisse == null) {
			if (other.codeCaisse != null)
				return false;
		} else if (!codeCaisse.equals(other.codeCaisse))
			return false;
		return true;
	}

	public CaisseModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public CaisseModel(Caisse c) {
		setCaisseId(c.getCaisseId());
		setCodeCaisse(c.getCodeCaisse());
		setDateDeCreation(c.getDateDeCreation());
		setDerniereMiseAJour(c.getDerniereMiseAJour());
		setDescriptionCaisse(c.getDescriptionCaisse());
		setResponsableId((c.getResponsable()==null)?null:c.getResponsable().getPartenaireId());
	}

}
