package com.camlait.global.erp.domain.model.json.operation.reglement;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.reglement.ModeDeReglement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ModeDeReglementModel extends Entite {

	private Long modeDeReglementId;

	private String codeModeReglement;

	private String descriptionModeReglement;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public ModeDeReglementModel(ModeDeReglement mr) {
		setCodeModeReglement(mr.getCodeModeReglement());
		setDateDeCreation(mr.getDateDeCreation());
		setDerniereMiseAJour(mr.getDerniereMiseAJour());
		setDescriptionModeReglement(mr.getDescriptionModeReglement());
		setModeDeReglementId(mr.getModeDeReglementId());
	}

}
