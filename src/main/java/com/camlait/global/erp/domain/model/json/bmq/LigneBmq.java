package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.Document;
import com.camlait.global.erp.domain.model.json.produit.ProduitModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LigneBmq extends Entite {

	private Long ligneBmqId;

	private ProduitModel produitModel;

	private Long quantiteLigne;

	private double prixUnitaireLigne;

	private Bmq bmq;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private Document document;

	private Collection<LigneBmqTaxe> ligneBmqTaxes;

	public Long getLigneBmqId() {
		return ligneBmqId;
	}

	public void setLigneBmqId(Long ligneBmqId) {
		this.ligneBmqId = ligneBmqId;
	}

	public ProduitModel getProduit() {
		return produitModel;
	}

	public void setProduit(ProduitModel produitModel) {
		this.produitModel = produitModel;
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

	public Bmq getBmq() {
		return bmq;
	}

	public void setBmq(Bmq bmq) {
		this.bmq = bmq;
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

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Collection<LigneBmqTaxe> getLigneBmqTaxes() {
		return ligneBmqTaxes;
	}

	public void setLigneBmqTaxes(Collection<LigneBmqTaxe> ligneBmqTaxes) {
		this.ligneBmqTaxes = ligneBmqTaxes;
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
		LigneBmq other = (LigneBmq) obj;
		if (ligneBmqId == null) {
			if (other.ligneBmqId != null)
				return false;
		} else if (!ligneBmqId.equals(other.ligneBmqId))
			return false;
		return true;
	}

	public LigneBmq() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

}
