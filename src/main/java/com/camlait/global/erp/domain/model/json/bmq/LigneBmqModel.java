package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.bmq.LigneBmq;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LigneBmqModel extends Entite {

	private Long ligneBmqId;

	private Long produitId;

	private Long quantiteLigne;

	private double prixUnitaireLigne;

	private Long bmqId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private Long documentId;

	@JsonManagedReference
	private Collection<LigneBmqTaxeModel> ligneBmqTaxeModels;

	public Long getLigneBmqId() {
		return ligneBmqId;
	}

	public void setLigneBmqId(Long ligneBmqId) {
		this.ligneBmqId = ligneBmqId;
	}

	public Long getQuantiteLigne() {
		return quantiteLigne;
	}

	public void setQuantiteLigne(Long quantiteLigne) {
		this.quantiteLigne = quantiteLigne;
	}

	public double getPrixUnitaireLigne() {
		return prixUnitaireLigne;
	}

	public void setPrixUnitaireLigne(double prixUnitaireLigne) {
		this.prixUnitaireLigne = prixUnitaireLigne;
	}

	public Long getProduitId() {
		return produitId;
	}

	public void setProduitId(Long produitId) {
		this.produitId = produitId;
	}

	public Long getBmqId() {
		return bmqId;
	}

	public void setBmqId(Long bmqId) {
		this.bmqId = bmqId;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public Collection<LigneBmqTaxeModel> getLigneBmqTaxeModels() {
		return ligneBmqTaxeModels;
	}

	public void setLigneBmqTaxeModels(Collection<LigneBmqTaxeModel> ligneBmqTaxeModels) {
		this.ligneBmqTaxeModels = ligneBmqTaxeModels;
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
		result = prime * result + ((ligneBmqId == null) ? 0 : ligneBmqId.hashCode());
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
		LigneBmqModel other = (LigneBmqModel) obj;
		if (ligneBmqId == null) {
			if (other.ligneBmqId != null)
				return false;
		} else if (!ligneBmqId.equals(other.ligneBmqId))
			return false;
		return true;
	}

	public LigneBmqModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public LigneBmqModel(LigneBmq lb) {
		setBmqId(lb.getBmq().getBmqId());
		setDateDeCreation(lb.getDateDeCreation());
		setDerniereMiseAJour(lb.getDerniereMiseAJour());
		setDocumentId((lb.getDocument() == null) ? null : lb.getDocument().getDocumentId());
		setLigneBmqId(lb.getLigneBmqId());
		setLigneBmqTaxeModels(getLigneBmqTaxeModels(lb));
		setPrixUnitaireLigne(lb.getPrixUnitaireLigne());
		setProduitId((lb.getProduit() == null) ? null : lb.getProduit().getProduitId());
		setQuantiteLigne(lb.getQuantiteLigne());
	}

	private Collection<LigneBmqTaxeModel> getLigneBmqTaxeModels(LigneBmq lb) {
		Collection<LigneBmqTaxeModel> lbs = new HashSet<>();
		lb.getLigneBmqTaxes().stream().forEach(l -> {
			lbs.add(new LigneBmqTaxeModel(l));
		});
		return lbs;

	}
}
