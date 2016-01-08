package com.camlait.global.erp.domain.model.json.produit;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "produitId")
public class Produit extends Entite {

	private Long produitId;

	private String codeProduit;

	private String descriptionProduit;

	private double prixUnitaireProduit;

	private double prixUnitaireMarge;

	private Long categorieId;

	private boolean produitTaxable;

	private Collection<ProduitTaxe> produitTaxes;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private boolean suiviEnStock;

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getDescriptionProduit() {
		return descriptionProduit;
	}

	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}

	public double getPrixUnitaireProduit() {
		return prixUnitaireProduit;
	}

	public void setPrixUnitaireProduit(double prixUnitaireProduit) {
		this.prixUnitaireProduit = prixUnitaireProduit;
	}

	public Long getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(Long categorieId) {
		this.categorieId = categorieId;
	}

	public boolean isProduitTaxable() {
		return produitTaxable;
	}

	public void setProduitTaxable(boolean produitTaxable) {
		this.produitTaxable = produitTaxable;
	}

	public Long getProduitId() {
		return produitId;
	}

	public void setProduitId(Long produitId) {
		this.produitId = produitId;
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

	public Collection<ProduitTaxe> getProduitTaxes() {
		return produitTaxes;
	}

	public void setProduitTaxes(Collection<ProduitTaxe> produitTaxes) {
		this.produitTaxes = produitTaxes;
	}

	public double getPrixUnitaireMarge() {
		return prixUnitaireMarge;
	}

	public void setPrixUnitaireMarge(double prixUnitaireMarge) {
		this.prixUnitaireMarge = prixUnitaireMarge;
	}

	public boolean isSuiviEnStock() {
		return suiviEnStock;
	}

	public void setSuiviEnStock(boolean suiviEnStock) {
		this.suiviEnStock = suiviEnStock;
	}

	@Override
	public String toString() {
		return "[" + produitId + "]-[" + codeProduit + "] " + descriptionProduit + " [pu]=" + prixUnitaireProduit
				+ " [pm]=" + prixUnitaireMarge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produitId == null) ? 0 : produitId.hashCode());
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
		Produit other = (Produit) obj;
		if (produitId == null) {
			if (other.produitId != null)
				return false;
		} else if (!produitId.equals(other.produitId))
			return false;
		return true;
	}

	public Produit() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

}
