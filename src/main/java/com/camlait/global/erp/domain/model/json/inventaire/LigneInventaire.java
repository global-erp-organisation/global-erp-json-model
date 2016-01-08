package com.camlait.global.erp.domain.model.json.inventaire;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.produit.Produit;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LigneInventaire extends Entite {

	private Long ligneInventaireId;

	private Inventaire inventaire;

	private Produit produit;

	private Long quantiteReelle;

	private Long quantiteAjustee;

	private double prixUnitaireReelle;

	private double prixUnitaireAjustee;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getLigneInventaireId() {
		return ligneInventaireId;
	}

	public void setLigneInventaireId(Long ligneInventaireId) {
		this.ligneInventaireId = ligneInventaireId;
	}

	public Inventaire getInventaire() {
		return inventaire;
	}

	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Long getQuantiteReelle() {
		return quantiteReelle;
	}

	public void setQuantiteReelle(Long quantiteReelle) {
		this.quantiteReelle = quantiteReelle;
	}

	public Long getQuantiteAjustee() {
		return quantiteAjustee;
	}

	public void setQuantiteAjustee(Long quantiteAjustee) {
		this.quantiteAjustee = quantiteAjustee;
	}

	public double getPrixUnitaireReelle() {
		return prixUnitaireReelle;
	}

	public void setPrixUnitaireReelle(double prixUnitaireReelle) {
		this.prixUnitaireReelle = prixUnitaireReelle;
	}

	public double getPrixUnitaireAjustee() {
		return prixUnitaireAjustee;
	}

	public void setPrixUnitaireAjustee(double prixUnitaireAjustee) {
		this.prixUnitaireAjustee = prixUnitaireAjustee;
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
		result = prime * result + ((ligneInventaireId == null) ? 0 : ligneInventaireId.hashCode());
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
		LigneInventaire other = (LigneInventaire) obj;
		if (ligneInventaireId == null) {
			if (other.ligneInventaireId != null)
				return false;
		} else if (!ligneInventaireId.equals(other.ligneInventaireId))
			return false;
		return true;
	}

	public LigneInventaire() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

}
