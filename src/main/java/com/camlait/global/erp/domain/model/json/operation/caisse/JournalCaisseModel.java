package com.camlait.global.erp.domain.model.json.operation.caisse;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.caisse.JournalCaisse;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class JournalCaisseModel extends Entite {

	private Long journalId;

	private String codeJournal;

	private String description;

	private Date dateDebutJournal;

	private Date dateFinJournal;

	private Long caisseId;

	@JsonManagedReference
	private Collection<OperationDeCaisseModel> operations;

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

	public Long getCaisseId() {
		return caisseId;
	}

	public void setCaisseId(Long caisseId) {
		this.caisseId = caisseId;
	}

	public Collection<OperationDeCaisseModel> getOperations() {
		return operations;
	}

	public void setOperations(Collection<OperationDeCaisseModel> opreations) {
		this.operations = opreations;
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
		JournalCaisseModel other = (JournalCaisseModel) obj;
		if (journalId == null) {
			if (other.journalId != null)
				return false;
		} else if (!journalId.equals(other.journalId))
			return false;
		return true;
	}

	public JournalCaisseModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public JournalCaisseModel(JournalCaisse j) {
		setCaisseId((j.getCaisse()==null)?null:j.getCaisse().getCaisseId());
		setCodeJournal(j.getCodeJournal());
		setDateDebutJournal(j.getDateDebutJournal());
		setDateFinJournal(j.getDateFinJournal());
		setDerniereMiseAJour(j.getDerniereMiseAJour());
		setDescription(j.getDescription());
		setJournalId(j.getJournalId());
		setOperations(getOperations(j));
	}

	private Collection<OperationDeCaisseModel> getOperations(JournalCaisse j) {
		Collection<OperationDeCaisseModel> ops = new HashSet<>();
		j.getOpreations().stream().forEach(o -> {
			ops.add(new OperationDeCaisseModel(o));
		});
		return ops;
	}
}
