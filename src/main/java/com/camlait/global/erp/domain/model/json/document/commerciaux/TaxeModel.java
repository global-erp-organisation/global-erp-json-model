package com.camlait.global.erp.domain.model.json.document.commerciaux;

import java.util.Date;

import com.camlait.global.erp.domain.document.commerciaux.Taxe;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class TaxeModel extends Entite {

	private Long taxeId;

	private String codeTaxe;

	private String taxeDescription;

	private double valeurPourcentage;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public TaxeModel(Taxe t) {
		setCodeTaxe(t.getCodeTaxe());
		setDateDeCreation(t.getDateDeCreation());
		setDerniereMiseAJour(t.getDerniereMiseAJour());
		setTaxeDescription(t.getTaxeDescription());
		setTaxeId(t.getTaxeId());
		setValeurPourcentage(t.getValeurPourcentage());
	}
}
