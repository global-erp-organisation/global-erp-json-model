package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.document.stock.sortie.DocumentDeSortie;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStockModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DocumentDeSortieModel extends DocumentDeStockModel {

	public DocumentDeSortieModel(DocumentDeSortie d) {
		super(d);
	}
}
