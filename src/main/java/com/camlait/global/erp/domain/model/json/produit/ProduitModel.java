package com.camlait.global.erp.domain.model.json.produit;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.produit.Produit;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Builder
public class ProduitModel extends Entite {

	private Long produitId;

	private String codeProduit;

	private String descriptionProduit;

	private double prixUnitaireProduit;

	private double prixUnitaireMarge;

	private Long categorieId;

	private boolean produitTaxable;

	@JsonManagedReference
	private Collection<ProduitTaxeModel> produitTaxeModels;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private boolean suiviEnStock;

	public ProduitModel(Produit p) {
		setCategorieId(p.getCategorie() == null ? null : p.getCategorie().getCategorieProduitId());
		setCodeProduit(p.getCodeProduit());
		setDerniereMiseAJour(p.getDerniereMiseAJour());
		setDateDeCreation(p.getDateDeCreation());
		setDescriptionProduit(p.getDescriptionProduit());
		setPrixUnitaireMarge(p.getPrixUnitaireMarge());
		setPrixUnitaireProduit(p.getPrixUnitaireProduit());
		setProduitId(p.getProduitId());
		setProduitTaxable(p.isProduitTaxable());
		setSuiviEnStock(p.isSuiviEnStock());
		setProduitTaxeModels(getTaxes(p));
	}

	public static ProduitModel createProduitModel(Produit p) {
		return builder()
				.categorieId(p.getCategorie() == null ? null : p.getCategorie().getCategorieProduitId())
				.codeProduit(p.getCodeProduit()).dateDeCreation(p.getDateDeCreation())
				.derniereMiseAJour(p.getDerniereMiseAJour()).descriptionProduit(p.getDescriptionProduit())
				.prixUnitaireMarge(p.getPrixUnitaireMarge()).prixUnitaireProduit(p.getPrixUnitaireProduit())
				.produitId(p.getProduitId()).produitTaxable(p.isProduitTaxable()).produitTaxeModels(getTaxes(p))
				.suiviEnStock(p.isSuiviEnStock()).build();

	}

	private static Collection<ProduitTaxeModel> getTaxes(Produit p) {
		Collection<ProduitTaxeModel> taxes = new HashSet<>();
		p.getProduitTaxes().stream().forEach(t -> {
			ProduitTaxeModel m = new ProduitTaxeModel();
			m.setDateDeCreation(t.getDateDeCreation());
			m.setDerniereMiseAJour(m.getDerniereMiseAJour());
			m.setProduitId(p.getProduitId());
			m.setProduitTaxeId(t.getProduitTaxeId());
			m.setTaxeId(t.getTaxe().getTaxeId());
		});
		return taxes;
	}

	public ProduitModel(Long produitId, String codeProduit, String descriptionProduit, double prixUnitaireProduit,
			double prixUnitaireMarge, Long categorieId, boolean produitTaxable,
			Collection<ProduitTaxeModel> produitTaxeModels, Date dateDeCreation, Date derniereMiseAJour,
			boolean suiviEnStock) {
		super();
		this.produitId = produitId;
		this.codeProduit = codeProduit;
		this.descriptionProduit = descriptionProduit;
		this.prixUnitaireProduit = prixUnitaireProduit;
		this.prixUnitaireMarge = prixUnitaireMarge;
		this.categorieId = categorieId;
		this.produitTaxable = produitTaxable;
		this.produitTaxeModels = produitTaxeModels;
		this.dateDeCreation = dateDeCreation;
		this.derniereMiseAJour = derniereMiseAJour;
		this.suiviEnStock = suiviEnStock;
	}

}
