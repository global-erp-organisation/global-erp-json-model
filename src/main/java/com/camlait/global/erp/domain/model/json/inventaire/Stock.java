package com.camlait.global.erp.domain.model.json.inventaire;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.entrepot.Magasin;
import com.camlait.global.erp.domain.model.json.produit.ProduitModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Stock extends Entite {

	private Long stockId;

	private ProduitModel produitModel;

	private Magasin magasin;

	private Long quantiteDisponible;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public ProduitModel getProduit() {
		return produitModel;
	}

	public void setProduit(ProduitModel produitModel) {
		this.produitModel = produitModel;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public Long getQuantiteDisponible() {
		return quantiteDisponible;
	}

	public void setQuantiteDisponible(Long quantiteDisponible) {
		this.quantiteDisponible = quantiteDisponible;
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

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stockId == null) ? 0 : stockId.hashCode());
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
		Stock other = (Stock) obj;
		if (stockId == null) {
			if (other.stockId != null)
				return false;
		} else if (!stockId.equals(other.stockId))
			return false;
		return true;
	}

	public Stock() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}
}
