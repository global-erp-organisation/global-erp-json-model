package com.camlait.global.erp.domain.model.json.document.stock.entree;

import com.camlait.global.erp.domain.document.stock.entree.BonEntree;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class BonEntreeModel extends DocumentEntreeModel {
	public BonEntreeModel(BonEntree b) {
		super(b);
	}

}
