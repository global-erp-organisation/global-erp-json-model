package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.operation.manquant.ManquantFinancierDu;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ManquantFinancierDuModel extends ManquantFinancierModel {

	public ManquantFinancierDuModel(ManquantFinancierDu m) {
		super(m);
	}
}
