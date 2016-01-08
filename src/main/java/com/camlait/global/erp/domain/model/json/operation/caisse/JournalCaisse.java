package com.camlait.global.erp.domain.model.json.operation.caisse;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class JournalCaisse extends Entite {

	private Long journalId;

	private String codeJournal;

	private String description;

	private Date dateDebutJournal;

	private Date dateFinJournal;

	private Caisse caisse;

	private Collection<OperationDeCaisse> opreations;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public String getCodeJournal() {
		return codeJournal;
	}

	public void setCodeJournal(String codeJournal) {
		this.codeJournal = codeJournal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getJournalId() {
		return journalId;
	}

	public void setJournalId(Long id) {
		this.journalId = id;
	}

	public Date getDateDebutJournal() {
		return dateDebutJournal;
	}

	public void setDateDebutJournal(Date dateDebutJournal) {
		this.dateDebutJournal = dateDebutJournal;
	}

	public Date getDateFinJournal() {
		return dateFinJournal;
	}

	public void setDateFinJournal(Date dateFinJournal) {
		this.dateFinJournal = dateFinJournal;
	}

	public Caisse getCaisse() {
		return caisse;
	}

	public Collection<OperationDeCaisse> getOpreations() {
		return opreations;
	}

	public void setOpreations(Collection<OperationDeCaisse> opreations) {
		this.opreations = opreations;
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
		result = prime * result + ((codeJournal == null) ? 0 : codeJournal.hashCode());
		result = prime * result + ((journalId == null) ? 0 : journalId.hashCode());
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
		JournalCaisse other = (JournalCaisse) obj;
		if (codeJournal == null) {
			if (other.codeJournal != null)
				return false;
		} else if (!codeJournal.equals(other.codeJournal))
			return false;
		if (journalId == null) {
			if (other.journalId != null)
				return false;
		} else if (!journalId.equals(other.journalId))
			return false;
		return true;
	}

	public void setCaisse(Caisse caisse) {
		this.caisse = caisse;
	}

	public JournalCaisse() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}
}
