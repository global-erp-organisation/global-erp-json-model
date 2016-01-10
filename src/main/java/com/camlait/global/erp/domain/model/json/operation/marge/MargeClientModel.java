package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.operation.marge.MargeClient;

public class MargeClientModel extends OperationModel {

	private Long clientId;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public MargeClientModel() {

	}

	public MargeClientModel(MargeClient m) {
		super(m);
		setClientId((m.getPartenaire()==null)?null:m.getPartenaire().getPartenaireId());
	}
}
