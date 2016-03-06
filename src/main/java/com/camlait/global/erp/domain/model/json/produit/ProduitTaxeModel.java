package com.camlait.global.erp.domain.model.json.produit;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.produit.ProduitTaxe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ProduitTaxeModel extends Entite {

	private Long produitTaxeId;

	private Long produitId;

	private Long taxeId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public ProduitTaxeModel(ProduitTaxe p) {
		setDateDeCreation(p.getDateDeCreation());
		setDerniereMiseAJour(p.getDerniereMiseAJour());
		setProduitId((p.getProduit() == null) ? null : p.getProduit().getProduitId());
		setProduitTaxeId(p.getProduitTaxeId());
		setTaxeId((p.getTaxe() == null) ? null : p.getTaxe().getTaxeId());
	}
}
