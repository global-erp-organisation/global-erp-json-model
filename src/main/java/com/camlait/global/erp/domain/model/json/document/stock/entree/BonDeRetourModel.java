package com.camlait.global.erp.domain.model.json.document.stock.entree;


import com.camlait.global.erp.domain.document.stock.entree.BonDeRetour;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class BonDeRetourModel extends DocumentEntreeModel {
	
	public BonDeRetourModel(BonDeRetour b) {
		super(b);
	}

}
