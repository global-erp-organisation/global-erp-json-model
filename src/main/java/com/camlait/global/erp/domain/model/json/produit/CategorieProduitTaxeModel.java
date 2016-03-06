package com.camlait.global.erp.domain.model.json.produit;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.produit.CategorieProduitTaxe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class CategorieProduitTaxeModel extends Entite {

	private Long categorieProduitTaxeId;

	private Long categorieId;

	private Long taxeId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public CategorieProduitTaxeModel(CategorieProduitTaxe c) {
		setCategorieId((c.getCategorie()==null)?null:c.getCategorie().getCategorieProduitId());
		setCategorieProduitTaxeId(c.getCategorieProduitTaxeId());
		setDateDeCreation(c.getDateDeCreation());
		setDerniereMiseAJour(c.getDerniereMiseAJour());
		setTaxeId((c.getTaxe()==null)?null:c.getTaxe().getTaxeId());
	}
}
