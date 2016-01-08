package com.camlait.global.erp.domain.model.json.immobilisation;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.partenaire.Partenaire;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class PartenaireImmobilisation {

	private Long clientImmoId;

	private Partenaire partenaire;

	private Immobilisation immobilisation;

	private Date dateAllocation;

	private boolean actif;

	private Date dateDeCreation;
	private Date derniereMiseAJour;

	public Long getClientImmoId() {
		return clientImmoId;
	}

	public void setClientImmoId(Long clientImmoId) {
		this.clientImmoId = clientImmoId;
	}

	public Partenaire getPartenaire() {
		return partenaire;
	}

	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}

	public Immobilisation getImmobilisation() {
		return immobilisation;
	}

	public void setImmobilisation(Immobilisation immobilisation) {
		this.immobilisation = immobilisation;
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
		result = prime * result + ((clientImmoId == null) ? 0 : clientImmoId.hashCode());
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
		PartenaireImmobilisation other = (PartenaireImmobilisation) obj;
		if (clientImmoId == null) {
			if (other.clientImmoId != null)
				return false;
		} else if (!clientImmoId.equals(other.clientImmoId))
			return false;
		return true;
	}

	public PartenaireImmobilisation() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());

	}

}
