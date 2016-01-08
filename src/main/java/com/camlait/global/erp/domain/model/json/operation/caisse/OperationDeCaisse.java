package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.model.json.operation.Operation;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class OperationDeCaisse extends Operation {

	private JournalCaisse journal;

	public JournalCaisse getJournal() {
		return journal;
	}

	public void setJournal(JournalCaisse journal) {
		this.journal = journal;
	}
}
