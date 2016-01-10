package com.camlait.global.erp.domain.model.json.operation;

import java.util.Date;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.Operation;

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

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public SensOperation getSensOperation() {
		return sensOperation;
	}

	public void setSensOperation(SensOperation sensOperation) {
		this.sensOperation = sensOperation;
	}

	public Long getOperationId() {
		return operationId;
	}

	public void setOperationId(Long id) {
		this.operationId = id;
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

	public String getLibelleOperation() {
		return libelleOperation;
	}

	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

	public Long getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(Long responsableId) {
		this.responsableId = responsableId;
	}

	public Long getPartenaireId() {
		return partenaireId;
	}

	public void setPartenaireId(Long partenaireId) {
		this.partenaireId = partenaireId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operationId == null) ? 0 : operationId.hashCode());
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
		OperationModel other = (OperationModel) obj;
		if (operationId == null) {
			if (other.operationId != null)
				return false;
		} else if (!operationId.equals(other.operationId))
			return false;
		return true;
	}

	public OperationModel() {
	}

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
