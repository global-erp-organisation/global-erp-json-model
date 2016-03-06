package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.document.commerciaux.vente.FactureMarge;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FactureMargeModel extends FactureClientModel {

	public FactureMargeModel(FactureMarge d) {
		super(d);
	}

}
