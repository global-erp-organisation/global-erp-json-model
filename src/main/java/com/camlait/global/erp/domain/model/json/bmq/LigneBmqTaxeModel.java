package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Date;

import com.camlait.global.erp.domain.bmq.LigneBmqTaxe;
import com.camlait.global.erp.domain.model.json.Entite;

public class LigneBmqTaxeModel extends Entite {

	private Long ligneBmqTaxeId;

	private Long ligneBmqId;

	private Long taxeId;

	private double tauxDeTaxe;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public Long getLigneBmqTaxeId() {
		return ligneBmqTaxeId;
	}

	public void setLigneBmqTaxeId(Long ligneBmqTaxeId) {
		this.ligneBmqTaxeId = ligneBmqTaxeId;
	}

	public Long getLigneBmqId() {
		return ligneBmqId;
	}

	public void setLigneBmqId(Long ligneBmqId) {
		this.ligneBmqId = ligneBmqId;
	}

	public Long getTaxeId() {
		return taxeId;
	}

	public void setTaxeId(Long taxeId) {
		this.taxeId = taxeId;
	}

	public double getTauxDeTaxe() {
		return tauxDeTaxe;
	}

	public void setTauxDeTaxe(double tauxDeTaxe) {
		this.tauxDeTaxe = tauxDeTaxe;
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
		result = prime * result + ((ligneBmqTaxeId == null) ? 0 : ligneBmqTaxeId.hashCode());
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
		LigneBmqTaxeModel other = (LigneBmqTaxeModel) obj;
		if (ligneBmqTaxeId == null) {
			if (other.ligneBmqTaxeId != null)
				return false;
		} else if (!ligneBmqTaxeId.equals(other.ligneBmqTaxeId))
			return false;
		return true;
	}

	public LigneBmqTaxeModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public LigneBmqTaxeModel(LigneBmqTaxe lb) {
		setDateDeCreation(lb.getDateDeCreation());
		setDerniereMiseAJour(lb.getDerniereMiseAJour());
		setLigneBmqId((lb.getLigneBmq() == null) ? null : lb.getLigneBmq().getLigneBmqId());
		setLigneBmqTaxeId(lb.getLigneBmqTaxeId());
		setTauxDeTaxe(lb.getTauxDeTaxe());
		setTaxeId((lb.getTaxe() == null) ? null : lb.getTaxe().getTaxeId());
	}
}
