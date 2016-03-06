package com.camlait.global.erp.domain.model.json.inventaire;

import java.util.Date;

import com.camlait.global.erp.domain.inventaire.LigneInventaire;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class LigneInventaireModel extends Entite {

	private Long ligneInventaireId;

	private Long inventaireId;

	private Long produitId;

	private Long quantiteReelle;

	private Long quantiteAjustee;

	private double prixUnitaireReelle;

	private double prixUnitaireAjustee;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public LigneInventaireModel(LigneInventaire l) {
		setDateDeCreation(l.getDateDeCreation());
		setDerniereMiseAJour(l.getDerniereMiseAJour());
		setInventaireId((l.getInventaire() == null) ? null : l.getInventaire().getInventaireId());
		setLigneInventaireId(l.getLigneInventaireId());
		setPrixUnitaireAjustee(l.getPrixUnitaireAjustee());
		setPrixUnitaireReelle(l.getPrixUnitaireReelle());
		setProduitId((l.getProduit() == null) ? null : l.getProduit().getProduitId());
		setQuantiteAjustee(l.getQuantiteAjustee());
		setQuantiteReelle(l.getQuantiteReelle());
	}

}
