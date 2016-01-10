package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.operation.manquant.ManquantFinancier;

public class ManquantFinancierModel extends OperationModel {

	private Long vendeurId;

	public Long getVendeurId() {
		return vendeurId;
	}

	public void setVendeurId(Long vendeurId) {
		this.vendeurId = vendeurId;
	}

	public ManquantFinancierModel() {

	}

	public ManquantFinancierModel(ManquantFinancier m) {
		super(m);
		setVendeurId((m.getPartenaire()==null)?null:m.getPartenaire().getPartenaireId());
	}
}
