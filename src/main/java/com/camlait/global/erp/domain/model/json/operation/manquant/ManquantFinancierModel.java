package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.operation.manquant.ManquantFinancier;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ManquantFinancierModel extends OperationModel {

	private Long vendeurId;

	public ManquantFinancierModel(ManquantFinancier m) {
		super(m);
		setVendeurId((m.getPartenaire()==null)?null:m.getPartenaire().getPartenaireId());
	}
}
