package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.operation.manquant.ManquantFinancierDu;

public class ManquantFinancierDuModel extends ManquantFinancierModel {

	public ManquantFinancierDuModel() {
		setSensOperation(SensOperation.ENTREE);
	}

	public ManquantFinancierDuModel(ManquantFinancierDu m) {
		super(m);
	}
}
