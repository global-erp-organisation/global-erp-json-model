package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.operation.caisse.Retrait;

public class RetraitModel extends OperationDeCaisseModel {

	public RetraitModel() {
		setSensOperation(SensOperation.SORTIE);
	}

	public RetraitModel(Retrait r) {
		super(r);
	}
}
