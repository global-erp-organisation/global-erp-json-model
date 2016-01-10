package com.camlait.global.erp.domain.model.json.document;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.document.LigneDeDocument;
import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LigneDeDocumentModel extends Entite {

	private Long ligneDeDocumentId;

	private Long produitId;

	private Long quantiteLigne;

	private double prixunitaiteLigne;

	private Long documentId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private SensOperation sensOperation;

	@JsonManagedReference
	private Collection<LigneDeDocumentTaxeModel> ligneDeDocumentTaxeModels;

	public Long getLigneDeDocumentId() {
		return ligneDeDocumentId;
	}

	public void setLigneDeDocumentId(Long ligneDeDocumentId) {
		this.ligneDeDocumentId = ligneDeDocumentId;
	}

	public Long getQuantiteLigne() {
		return quantiteLigne;
	}

	public void setQuantiteLigne(Long quantiteLigne) {
		this.quantiteLigne = quantiteLigne;
	}

	public double getPrixunitaiteLigne() {
		return prixunitaiteLigne;
	}

	public void setPrixunitaiteLigne(double prixunitaiteLigne) {
		this.prixunitaiteLigne = prixunitaiteLigne;
	}

	public Long getProduitId() {
		return produitId;
	}

	public void setProduitId(Long produitId) {
		this.produitId = produitId;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public Collection<LigneDeDocumentTaxeModel> getLigneDeDocumentTaxeModels() {
		return ligneDeDocumentTaxeModels;
	}

	public void setLigneDeDocumentTaxeModels(Collection<LigneDeDocumentTaxeModel> ligneDeDocumentTaxeModels) {
		this.ligneDeDocumentTaxeModels = ligneDeDocumentTaxeModels;
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

	public SensOperation getSensOperation() {
		return sensOperation;
	}

	public void setSensOperation(SensOperation sensOperation) {
		this.sensOperation = sensOperation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ligneDeDocumentId == null) ? 0 : ligneDeDocumentId.hashCode());
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
		LigneDeDocumentModel other = (LigneDeDocumentModel) obj;
		if (ligneDeDocumentId == null) {
			if (other.ligneDeDocumentId != null)
				return false;
		} else if (!ligneDeDocumentId.equals(other.ligneDeDocumentId))
			return false;
		return true;
	}

	public LigneDeDocumentModel() {

	}

	public LigneDeDocumentModel(LigneDeDocument l) {
		setDateDeCreation(l.getDateDeCreation());
		setDerniereMiseAJour(l.getDerniereMiseAJour());
		setDocumentId((l.getDocument()==null)?null:l.getDocument().getDocumentId());
		setLigneDeDocumentId(l.getLigneDeDocumentId());
		setLigneDeDocumentTaxeModels(getTaxe(l));
		setPrixunitaiteLigne(l.getPrixunitaiteLigne());
		setProduitId((l.getProduit()==null)?null:l.getProduit().getProduitId());
		setQuantiteLigne(l.getQuantiteLigne());
		setSensOperation(l.getSensOperation());
	}

	private Collection<LigneDeDocumentTaxeModel> getTaxe(LigneDeDocument l) {
		Collection<LigneDeDocumentTaxeModel> lm = new HashSet<>();
		l.getLigneDeDocumentTaxes().stream().forEach(t -> {
			lm.add(new LigneDeDocumentTaxeModel(t));
		});
		return lm;
	}

}
