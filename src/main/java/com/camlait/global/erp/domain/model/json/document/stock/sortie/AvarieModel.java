package com.camlait.global.erp.domain.model.json.document.stock.sortie;


import com.camlait.global.erp.domain.document.stock.sortie.Avarie;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class AvarieModel extends DocumentDeSortieModel {
	public AvarieModel(Avarie a) {
		super(a);
	}

}
