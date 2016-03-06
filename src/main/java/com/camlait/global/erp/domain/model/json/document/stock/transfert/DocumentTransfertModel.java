package com.camlait.global.erp.domain.model.json.document.stock.transfert;

import com.camlait.global.erp.domain.document.stock.transfert.DocumentTransfert;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStockModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DocumentTransfertModel extends DocumentDeStockModel {

	private Long magasinDestinationId;
	
	public DocumentTransfertModel(DocumentTransfert d) {
		super(d);
		setMagasinDestinationId((d.getMagasinDestination() == null) ? null : d.getMagasinDestination().getMagasinId());
	}

}
