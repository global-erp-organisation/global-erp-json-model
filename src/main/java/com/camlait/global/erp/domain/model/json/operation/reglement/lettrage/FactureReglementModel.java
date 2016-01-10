package com.camlait.global.erp.domain.model.json.operation.reglement.lettrage;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.reglement.lettrage.FactureReglement;

public class FactureReglementModel extends Entite {

	private Long factureReglementId;

	private Long factureId;

	private Long reglementId;

	private Date dateDeVentilation;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getFactureReglementId() {
		return factureReglementId;
	}

	public void setFactureReglementId(Long factureReglementId) {
		this.factureReglementId = factureReglementId;
	}

	public Long getFactureId() {
		return factureId;
	}

	public void setFactureId(Long factureId) {
		this.factureId = factureId;
	}

	public Long getReglementId() {
		return reglementId;
	}

	public void setReglementId(Long reglementId) {
		this.reglementId = reglementId;
	}

	public Date getDateDeVentilation() {
		return dateDeVentilation;
	}

	public void setDateDeVentilation(Date dateDeVentilation) {
		this.dateDeVentilation = dateDeVentilation;
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
		result = prime * result + ((factureReglementId == null) ? 0 : factureReglementId.hashCode());
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
		FactureReglementModel other = (FactureReglementModel) obj;
		if (factureReglementId == null) {
			if (other.factureReglementId != null)
				return false;
		} else if (!factureReglementId.equals(other.factureReglementId))
			return false;
		return true;
	}

	public FactureReglementModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public FactureReglementModel(FactureReglement fr) {
		setDateDeCreation(fr.getDateDeCreation());
		setDateDeVentilation(fr.getDateDeVentilation());
		setDerniereMiseAJour(fr.getDerniereMiseAJour());
		setFactureId((fr.getFacture()==null)?null:fr.getFacture().getDocumentId());
		setFactureReglementId(fr.getFactureReglementId());
		setReglementId((fr.getReglement()==null)?null:fr.getReglement().getOperationId());
	}

}
