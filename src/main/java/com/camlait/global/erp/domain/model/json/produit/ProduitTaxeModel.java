package com.camlait.global.erp.domain.model.json.produit;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.produit.ProduitTaxe;

public class ProduitTaxeModel extends Entite {

	private Long produitTaxeId;

	private Long produitId;

	private Long taxeId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getProduitId() {
		return produitId;
	}

	public void setProduitId(Long produitId) {
		this.produitId = produitId;
	}

	public Long getTaxeId() {
		return taxeId;
	}

	public void setTaxeId(Long taxeId) {
		this.taxeId = taxeId;
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

	public Long getProduitTaxeId() {
		return produitTaxeId;
	}

	public void setProduitTaxeId(Long produitTaxeId) {
		this.produitTaxeId = produitTaxeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produitTaxeId == null) ? 0 : produitTaxeId.hashCode());
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
		ProduitTaxeModel other = (ProduitTaxeModel) obj;
		if (produitTaxeId == null) {
			if (other.produitTaxeId != null)
				return false;
		} else if (!produitTaxeId.equals(other.produitTaxeId))
			return false;
		return true;
	}

	public ProduitTaxeModel() {
	}

	public ProduitTaxeModel(ProduitTaxe p) {
		setDateDeCreation(p.getDateDeCreation());
		setDerniereMiseAJour(p.getDerniereMiseAJour());
		setProduitId((p.getProduit() == null) ? null : p.getProduit().getProduitId());
		setProduitTaxeId(p.getProduitTaxeId());
		setTaxeId((p.getTaxe() == null) ? null : p.getTaxe().getTaxeId());
	}
}
