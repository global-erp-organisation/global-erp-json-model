package com.camlait.global.erp.domain.model.json.produit;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.produit.CategorieProduitTaxe;

public class CategorieProduitTaxeModel extends Entite {

	private Long categorieProduitTaxeId;

	private Long categorieId;

	private Long taxeId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getCategorieProduitTaxeId() {
		return categorieProduitTaxeId;
	}

	public void setCategorieProduitTaxeId(Long categorieProduitTaxeId) {
		this.categorieProduitTaxeId = categorieProduitTaxeId;
	}

	public Long getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(Long categorieId) {
		this.categorieId = categorieId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorieProduitTaxeId == null) ? 0 : categorieProduitTaxeId.hashCode());
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
		CategorieProduitTaxeModel other = (CategorieProduitTaxeModel) obj;
		if (categorieProduitTaxeId == null) {
			if (other.categorieProduitTaxeId != null)
				return false;
		} else if (!categorieProduitTaxeId.equals(other.categorieProduitTaxeId))
			return false;
		return true;
	}

	public CategorieProduitTaxeModel() {
		
	}

	public CategorieProduitTaxeModel(CategorieProduitTaxe c) {
		setCategorieId((c.getCategorie()==null)?null:c.getCategorie().getCategorieProduitId());
		setCategorieProduitTaxeId(c.getCategorieProduitTaxeId());
		setDateDeCreation(c.getDateDeCreation());
		setDerniereMiseAJour(c.getDerniereMiseAJour());
		setTaxeId((c.getTaxe()==null)?null:c.getTaxe().getTaxeId());
	}
}
