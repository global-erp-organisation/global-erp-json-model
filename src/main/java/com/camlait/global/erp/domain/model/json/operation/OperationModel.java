package com.camlait.global.erp.domain.model.json.operation;

import java.util.Date;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.Operation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class OperationModel extends Entite {

	private Long operationId;

	private Date dateOperation;

	private SensOperation sensOperation;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private String libelleOperation;

	private double montantOperation;

	private Long responsableId;

	private Long partenaireId;


	public OperationModel(Operation o) {
		setDateDeCreation(o.getDateDeCreation());
		setDerniereMiseAJour(o.getDerniereMiseAJour());
		setDateOperation(o.getDateOperation());
		setLibelleOperation(o.getLibelleOperation());
		setMontantOperation(o.getMontantOperation());
		setOperationId(o.getOperationId());
		setPartenaireId((o.getPartenaire()==null)?null:o.getPartenaire().getPartenaireId());
		setResponsableId((o.getResponsable()==null)?null:o.getResponsable().getPartenaireId());
		setSensOperation(o.getSensOperation());
	}
}
