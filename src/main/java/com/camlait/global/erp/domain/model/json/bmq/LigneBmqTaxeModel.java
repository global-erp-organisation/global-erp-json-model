package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Date;

import com.camlait.global.erp.domain.bmq.LigneBmqTaxe;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class LigneBmqTaxeModel extends Entite {

	private Long ligneBmqTaxeId;

	private Long ligneBmqId;

	private Long taxeId;

	private double tauxDeTaxe;

	private Date dateDeCreation;

	private Date derniereMiseAJour;
	
	public LigneBmqTaxeModel(LigneBmqTaxe lb) {
		setDateDeCreation(lb.getDateDeCreation());
		setDerniereMiseAJour(lb.getDerniereMiseAJour());
		setLigneBmqId((lb.getLigneBmq() == null) ? null : lb.getLigneBmq().getLigneBmqId());
		setLigneBmqTaxeId(lb.getLigneBmqTaxeId());
		setTauxDeTaxe(lb.getTauxDeTaxe());
		setTaxeId((lb.getTaxe() == null) ? null : lb.getTaxe().getTaxeId());
	}
}
