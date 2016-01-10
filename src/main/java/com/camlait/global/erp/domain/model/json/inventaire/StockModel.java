package com.camlait.global.erp.domain.model.json.inventaire;

import java.util.Date;

import com.camlait.global.erp.domain.inventaire.Stock;
import com.camlait.global.erp.domain.model.json.Entite;

public class StockModel extends Entite {

	private Long stockId;

	private Long produitId;

	private Long magasinId;

	private Long quantiteDisponible;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getProduitId() {
		return produitId;
	}

	public void setProduitId(Long produitId) {
		this.produitId = produitId;
	}

	public Long getMagasinId() {
		return magasinId;
	}

	public void setMagasinId(Long magasinId) {
		this.magasinId = magasinId;
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
		StockModel other = (StockModel) obj;
		if (stockId == null) {
			if (other.stockId != null)
				return false;
		} else if (!stockId.equals(other.stockId))
			return false;
		return true;
	}

	public StockModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public StockModel(Stock s) {
		setDateDeCreation(s.getDateDeCreation());
		setDerniereMiseAJour(s.getDerniereMiseAJour());
		setMagasinId((s.getMagasin()==null)?null:s.getMagasin().getMagasinId());
		setProduitId((s.getProduit()==null)?null:s.getProduit().getProduitId());
		setQuantiteDisponible(s.getQuantiteDisponible());
		setStockId(s.getStockId());
	}

}
