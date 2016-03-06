package com.camlait.global.erp.domain.model.json.document.stock.entree;


import com.camlait.global.erp.domain.document.stock.entree.DocumentEntree;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStockModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DocumentEntreeModel extends DocumentDeStockModel {
	
	public DocumentEntreeModel(DocumentEntree d) {
		super(d);
	}

}
