package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.operation.marge.MargeClient;

public class MargeClientDuModel extends MargeClientModel {

	public MargeClientDuModel() {
		setSensOperation(SensOperation.ENTREE);
	}

	public MargeClientDuModel(MargeClient m) {
		super(m);
	}
}
