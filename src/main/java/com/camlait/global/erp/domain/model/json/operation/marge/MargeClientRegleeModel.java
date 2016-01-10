package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.operation.marge.MargeClientReglee;

public class MargeClientRegleeModel extends MargeClientModel {

	public MargeClientRegleeModel() {
		setSensOperation(SensOperation.SORTIE);
	}

	public MargeClientRegleeModel(MargeClientReglee m) {
		super(m);
	}
}
