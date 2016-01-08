package com.camlait.global.erp.domain.model.json.operation.reglement;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.operation.Operation;
import com.camlait.global.erp.domain.model.json.operation.reglement.lettrage.FactureReglement;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Reglement extends Operation {

	private Collection<FactureReglement> factureReglements;

	private ModeDeReglement modeDeReglement;

	public Collection<FactureReglement> getFactureReglements() {
		return factureReglements;
	}

	public void setFactureReglements(Collection<FactureReglement> factureReglements) {
		this.factureReglements = factureReglements;
	}

	public ModeDeReglement getModeDeReglement() {
		return modeDeReglement;
	}

	public void setModeDeReglement(ModeDeReglement modeDeReglement) {
		this.modeDeReglement = modeDeReglement;
	}

}
