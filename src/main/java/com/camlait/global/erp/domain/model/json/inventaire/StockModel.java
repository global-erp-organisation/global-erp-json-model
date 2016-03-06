package com.camlait.global.erp.domain.model.json.inventaire;

import java.util.Date;

import com.camlait.global.erp.domain.inventaire.Stock;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class StockModel extends Entite {

	private Long stockId;

	private Long produitId;

	private Long magasinId;

	private Long quantiteDisponible;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public StockModel(Stock s) {
		setDateDeCreation(s.getDateDeCreation());
		setDerniereMiseAJour(s.getDerniereMiseAJour());
		setMagasinId((s.getMagasin()==null)?null:s.getMagasin().getMagasinId());
		setProduitId((s.getProduit()==null)?null:s.getProduit().getProduitId());
		setQuantiteDisponible(s.getQuantiteDisponible());
		setStockId(s.getStockId());
	}

}
