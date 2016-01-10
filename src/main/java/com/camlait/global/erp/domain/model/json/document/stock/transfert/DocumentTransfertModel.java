package com.camlait.global.erp.domain.model.json.document.stock.transfert;

import com.camlait.global.erp.domain.document.stock.transfert.DocumentTransfert;
import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.document.stock.DocumentDeStockModel;

public class DocumentTransfertModel extends DocumentDeStockModel {

	private Long magasinDestinationId;

	public Long getMagasinDestinationId() {
		return magasinDestinationId;
	}

	public void setMagasinDestinationId(Long magasinDestinationId) {
		this.magasinDestinationId = magasinDestinationId;
	}

	public DocumentTransfertModel() {
		setSensOperation(SensOperation.VIREMENT);
		setTypeDocument(TypeDocuments.TRANSFERT);
	}

	public DocumentTransfertModel(DocumentTransfert d) {
		super(d);
		setMagasinDestinationId((d.getMagasinDestination() == null) ? null : d.getMagasinDestination().getMagasinId());
	}

}
