package com.camlait.global.erp.domain.model.json.produit;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.enumeration.Portee;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class CategorieProduit extends Entite {

	private Long categorieProduitId;

	private Long categorieParentId;

	private String codeCategorieProduit;

	private String descriptionCategorie;

	private Portee portee;

	private boolean categorieTaxable;

	private boolean suiviEnStock;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	@JsonManagedReference
	private Collection<Produit> produits;

	private Collection<CategorieProduitTaxe> categorieProduitTaxes;

	public Long getCategorieProduitId() {
		return categorieProduitId;
	}

	public void setCategorieProduitId(Long categorieProduitId) {
		this.categorieProduitId = categorieProduitId;
	}

	public Long getCategorieParentId() {
		return categorieParentId;
	}

	public void setCategorieParentId(Long categorieParentId) {
		this.categorieParentId = categorieParentId;
	}

	public String getCodeCategorieProduit() {
		return codeCategorieProduit;
	}

	public void setCodeCategorieProduit(String codeCategorieProduit) {
		this.codeCategorieProduit = codeCategorieProduit;
	}

	public String getDescriptionCategorie() {
		return descriptionCategorie;
	}

	public void setDescriptionCategorie(String descriptionCategorie) {
		this.descriptionCategorie = descriptionCategorie;
	}

	public Portee getPortee() {
		return portee;
	}

	public void setPortee(Portee portee) {
		this.portee = portee;
	}

	public boolean isCategorieTaxable() {
		return categorieTaxable;
	}

	public void setCategorieTaxable(boolean categorieTaxable) {
		this.categorieTaxable = categorieTaxable;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
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

	public Collection<CategorieProduitTaxe> getCategorieProduitTaxes() {
		return categorieProduitTaxes;
	}

	public void setCategorieProduitTaxes(Collection<CategorieProduitTaxe> categorieProduitTaxes) {
		this.categorieProduitTaxes = categorieProduitTaxes;
	}

	public boolean isSuiviEnStock() {
		return suiviEnStock;
	}

	public void setSuiviEnStock(boolean suiviEnStock) {
		this.suiviEnStock = suiviEnStock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorieProduitId == null) ? 0 : categorieProduitId.hashCode());
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
		CategorieProduit other = (CategorieProduit) obj;
		if (categorieProduitId == null) {
			if (other.categorieProduitId != null)
				return false;
		} else if (!categorieProduitId.equals(other.categorieProduitId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + categorieProduitId + "]-[" + codeCategorieProduit + "] " + descriptionCategorie;
	}

	public CategorieProduit() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}
}
