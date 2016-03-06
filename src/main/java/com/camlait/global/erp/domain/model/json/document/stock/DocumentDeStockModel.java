package com.camlait.global.erp.domain.model.json.document.stock;

import com.camlait.global.erp.domain.document.stock.DocumentDeStock;
import com.camlait.global.erp.domain.model.json.document.DocumentModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DocumentDeStockModel extends DocumentModel {

	public DocumentDeStockModel(DocumentDeStock d) {
		super(d);
	}

}
