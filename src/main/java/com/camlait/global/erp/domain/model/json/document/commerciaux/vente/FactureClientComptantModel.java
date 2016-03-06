package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.document.commerciaux.vente.FactureClientComptant;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FactureClientComptantModel extends FactureClientModel {

	public FactureClientComptantModel(FactureClientComptant d) {
		super(d);
	}
}
