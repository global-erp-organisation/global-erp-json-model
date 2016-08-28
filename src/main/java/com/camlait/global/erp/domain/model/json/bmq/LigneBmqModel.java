package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.bmq.LigneBmq;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class LigneBmqModel extends Entite {

	private Long ligneBmqId;

	private Long produitId;

	private Long quantiteLigne;

	private double prixUnitaireLigne;

	private Long bmqId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private Long documentId;

	@JsonManagedReference
	private Collection<LigneBmqTaxeModel> ligneBmqTaxeModels;

	public LigneBmqModel(LigneBmq lb) {
		setBmqId(lb.getBmq().getBmqId());
		setDateDeCreation(lb.getDateDeCreation());
		setDerniereMiseAJour(lb.getDerniereMiseAJour());
		setDocumentId((lb.getDocument() == null) ? null : lb.getDocument().getDocumentId());
		setLigneBmqId(lb.getLigneBmqId());
		setLigneBmqTaxeModels(getLigneBmqTaxeModels(lb));
		setPrixUnitaireLigne(lb.getPrixUnitaireLigne());
		setProduitId((lb.getProduit() == null) ? null : lb.getProduit().getProduitId());
		setQuantiteLigne(lb.getQuantiteLigne());
	}

	private Collection<LigneBmqTaxeModel> getLigneBmqTaxeModels(LigneBmq lb) {
		return lb.getLigneBmqTaxes().stream().map(l->{
		    return new LigneBmqTaxeModel(l);
		}).collect(Collectors.toList());
	}
}
