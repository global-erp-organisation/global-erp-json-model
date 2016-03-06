package com.camlait.global.erp.domain.model.json.operation.reglement.lettrage;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.reglement.lettrage.FactureReglement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class FactureReglementModel extends Entite {

	private Long factureReglementId;

	private Long factureId;

	private Long reglementId;

	private Date dateDeVentilation;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public FactureReglementModel(FactureReglement fr) {
		setDateDeCreation(fr.getDateDeCreation());
		setDateDeVentilation(fr.getDateDeVentilation());
		setDerniereMiseAJour(fr.getDerniereMiseAJour());
		setFactureId((fr.getFacture()==null)?null:fr.getFacture().getDocumentId());
		setFactureReglementId(fr.getFactureReglementId());
		setReglementId((fr.getReglement()==null)?null:fr.getReglement().getOperationId());
	}

}
