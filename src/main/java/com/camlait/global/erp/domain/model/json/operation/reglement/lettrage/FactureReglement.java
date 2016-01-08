package com.camlait.global.erp.domain.model.json.operation.reglement.lettrage;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.FactureClient;
import com.camlait.global.erp.domain.model.json.operation.reglement.Reglement;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class FactureReglement extends Entite {

	private Long factureReglementId;

	private FactureClient facture;

	private Reglement reglement;

	private Date dateDeVentilation;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getFactureReglementId() {
		return factureReglementId;
	}

	public void setFactureReglementId(Long factureReglementId) {
		this.factureReglementId = factureReglementId;
	}

	public FactureClient getFacture() {
		return facture;
	}

	public void setFacture(FactureClient facture) {
		this.facture = facture;
	}

	public Reglement getReglement() {
		return reglement;
	}

	public void setReglement(Reglement reglement) {
		this.reglement = reglement;
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
		FactureReglement other = (FactureReglement) obj;
		if (factureReglementId == null) {
			if (other.factureReglementId != null)
				return false;
		} else if (!factureReglementId.equals(other.factureReglementId))
			return false;
		return true;
	}

	public FactureReglement() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}
}
