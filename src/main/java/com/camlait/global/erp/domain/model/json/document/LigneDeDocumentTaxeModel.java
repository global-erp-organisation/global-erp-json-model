package com.camlait.global.erp.domain.model.json.document;

import java.util.Date;

import com.camlait.global.erp.domain.document.LigneDeDocumentTaxe;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LigneDeDocumentTaxeModel extends Entite {
	private Long ligneDeDocumentTaxeId;

	private Long ligneDeDocumentId;

	private Long taxeId;

	private double tauxDeTaxe;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getLigneDeDocumentId() {
		return ligneDeDocumentId;
	}

	public void setLigneDeDocumentId(Long ligneDeDocumentId) {
		this.ligneDeDocumentId = ligneDeDocumentId;
	}

	public Long getTaxeId() {
		return taxeId;
	}

	public void setTaxeId(Long taxeId) {
		this.taxeId = taxeId;
	}

	public double getTauxDeTaxe() {
		return tauxDeTaxe;
	}

	public void setTauxDeTaxe(double tauxDeTaxe) {
		this.tauxDeTaxe = tauxDeTaxe;
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

	public Long getLigneDeDocumentTaxeId() {
		return ligneDeDocumentTaxeId;
	}

	public void setLigneDeDocumentTaxeId(Long ligneDeDocumentTaxeId) {
		this.ligneDeDocumentTaxeId = ligneDeDocumentTaxeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ligneDeDocumentTaxeId == null) ? 0 : ligneDeDocumentTaxeId.hashCode());
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
		LigneDeDocumentTaxeModel other = (LigneDeDocumentTaxeModel) obj;
		if (ligneDeDocumentTaxeId == null) {
			if (other.ligneDeDocumentTaxeId != null)
				return false;
		} else if (!ligneDeDocumentTaxeId.equals(other.ligneDeDocumentTaxeId))
			return false;
		return true;
	}

	public LigneDeDocumentTaxeModel() {
	}

	public LigneDeDocumentTaxeModel(LigneDeDocumentTaxe l) {
		setDateDeCreation(l.getDateDeCreation());
		setDerniereMiseAJour(l.getDerniereMiseAJour());
		setLigneDeDocumentId((l.getLigneDeDocument() == null) ? null : l.getLigneDeDocument().getLigneDeDocumentId());
		setLigneDeDocumentTaxeId(l.getLigneDeDocumentTaxeId());
		setTauxDeTaxe(l.getTauxDeTaxe());
		setTaxeId((l.getTaxe() == null) ? null : l.getTaxe().getTaxeId());
	}

}
