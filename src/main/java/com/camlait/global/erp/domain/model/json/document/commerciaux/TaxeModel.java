package com.camlait.global.erp.domain.model.json.document.commerciaux;

import java.util.Date;

import com.camlait.global.erp.domain.document.commerciaux.Taxe;
import com.camlait.global.erp.domain.model.json.Entite;

public class TaxeModel extends Entite {

	private Long taxeId;

	private String codeTaxe;

	private String taxeDescription;

	private double valeurPourcentage;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public String getCodeTaxe() {
		return codeTaxe;
	}

	public void setCodeTaxe(String codeTaxe) {
		this.codeTaxe = codeTaxe;
	}

	public String getTaxeDescription() {
		return taxeDescription;
	}

	public void setTaxeDescription(String taxeDescription) {
		this.taxeDescription = taxeDescription;
	}

	public double getValeurPourcentage() {
		return valeurPourcentage;
	}

	public void setValeurPourcentage(double valeurPourcentage) {
		this.valeurPourcentage = valeurPourcentage;
	}

	public Long getTaxeId() {
		return taxeId;
	}

	public void setTaxeId(Long taxeId) {
		this.taxeId = taxeId;
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

	public TaxeModel(Long taxeId, String codeTaxe) {
		super();
		this.taxeId = taxeId;
		this.codeTaxe = codeTaxe;
	}

	public TaxeModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public TaxeModel(Taxe t) {
		setCodeTaxe(t.getCodeTaxe());
		setDateDeCreation(t.getDateDeCreation());
		setDerniereMiseAJour(t.getDerniereMiseAJour());
		setTaxeDescription(t.getTaxeDescription());
		setTaxeId(t.getTaxeId());
		setValeurPourcentage(t.getValeurPourcentage());
	}

}
