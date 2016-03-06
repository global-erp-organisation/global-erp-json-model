package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.operation.caisse.OperationDeCaisse;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class OperationDeCaisseModel extends OperationModel {

	private Long journalId;

	public OperationDeCaisseModel(OperationDeCaisse o) {
		super(o);
		setJournalId((o.getJournal()==null)?null:o.getJournal().getJournalId());
	}

}
