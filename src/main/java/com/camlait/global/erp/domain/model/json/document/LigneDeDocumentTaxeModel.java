package com.camlait.global.erp.domain.model.json.document;

import java.util.Date;

import com.camlait.global.erp.domain.document.LigneDeDocumentTaxe;
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
public class LigneDeDocumentTaxeModel extends Entite {
	private Long ligneDeDocumentTaxeId;

	private Long ligneDeDocumentId;

	private Long taxeId;

	private double tauxDeTaxe;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public LigneDeDocumentTaxeModel(LigneDeDocumentTaxe l) {
		setDateDeCreation(l.getDateDeCreation());
		setDerniereMiseAJour(l.getDerniereMiseAJour());
		setLigneDeDocumentId((l.getLigneDeDocument() == null) ? null : l.getLigneDeDocument().getLigneDeDocumentId());
		setLigneDeDocumentTaxeId(l.getLigneDeDocumentTaxeId());
		setTauxDeTaxe(l.getTauxDeTaxe());
		setTaxeId((l.getTaxe() == null) ? null : l.getTaxe().getTaxeId());
	}

}
