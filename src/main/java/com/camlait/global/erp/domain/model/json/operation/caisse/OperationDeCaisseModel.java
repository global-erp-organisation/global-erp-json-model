package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.operation.caisse.OperationDeCaisse;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class OperationDeCaisseModel extends OperationModel {

	private Long journalId;

	public Long getJournalId() {
		return journalId;
	}

	public void setJournalId(Long journalId) {
		this.journalId = journalId;
	}

	public OperationDeCaisseModel() {
	}

	public OperationDeCaisseModel(OperationDeCaisse o) {
		super(o);
		setJournalId((o.getJournal()==null)?null:o.getJournal().getJournalId());
	}

}
