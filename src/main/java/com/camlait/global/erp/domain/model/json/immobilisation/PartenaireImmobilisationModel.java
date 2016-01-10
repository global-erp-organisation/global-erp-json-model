package com.camlait.global.erp.domain.model.json.immobilisation;

import java.util.Date;

import com.camlait.global.erp.domain.immobilisation.PartenaireImmobilisation;

public class PartenaireImmobilisationModel {

	private Long partenaireImmoId;

	private Long partenaireId;

	private Long immoId;

	private Date dateAllocation;

	private boolean actif;

	private Date dateDeCreation;
	private Date derniereMiseAJour;

	public Long getPartenaireImmoId() {
		return partenaireImmoId;
	}

	public void setPartenaireImmoId(Long clientImmoId) {
		this.partenaireImmoId = clientImmoId;
	}

	public Long getPartenaireId() {
		return partenaireId;
	}

	public void setPartenaireId(Long partenaireId) {
		this.partenaireId = partenaireId;
	}

	public Long getImmoId() {
		return immoId;
	}

	public void setImmoId(Long immoId) {
		this.immoId = immoId;
	}

	public Date getDateAllocation() {
		return dateAllocation;
	}

	public void setDateAllocation(Date dateAllocation) {
		this.dateAllocation = dateAllocation;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(Date dateCreation) {
		this.dateDeCreation = dateCreation;
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
		result = prime * result + ((partenaireImmoId == null) ? 0 : partenaireImmoId.hashCode());
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
		PartenaireImmobilisationModel other = (PartenaireImmobilisationModel) obj;
		if (partenaireImmoId == null) {
			if (other.partenaireImmoId != null)
				return false;
		} else if (!partenaireImmoId.equals(other.partenaireImmoId))
			return false;
		return true;
	}

	public PartenaireImmobilisationModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());

	}

	public PartenaireImmobilisationModel(PartenaireImmobilisation i) {
		setActif(i.isActif());
		setPartenaireImmoId(i.getClientImmoId());
		setDateDeCreation(i.getDateDeCreation());
		setDateAllocation(i.getDateAllocation());
		setDerniereMiseAJour(i.getDerniereMiseAJour());
		setImmoId((i.getImmobilisation() == null) ? null : i.getImmobilisation().getImmoId());
		setPartenaireId((i.getPartenaire() == null) ? null : i.getPartenaire().getPartenaireId());
	}
}
