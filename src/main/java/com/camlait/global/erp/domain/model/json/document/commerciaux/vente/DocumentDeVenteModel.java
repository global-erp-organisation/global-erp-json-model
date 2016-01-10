package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.document.commerciaux.vente.DocumentDeVente;
import com.camlait.global.erp.domain.model.json.document.commerciaux.DocumentCommerciauxModel;

public class DocumentDeVenteModel extends DocumentCommerciauxModel {

	private Long clientId;

	private Long zoneId;

	private boolean documentSolde;

	public boolean isDocumentSolde() {
		return documentSolde;
	}

	public void setDocumentSolde(boolean documentSolde) {
		this.documentSolde = documentSolde;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getZoneId() {
		return zoneId;
	}

	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
	}

	public DocumentDeVenteModel() {
	}

	public DocumentDeVenteModel(DocumentDeVente d) {
		super(d);
		setClientId((d.getClient()==null)?null:d.getClient().getPartenaireId());
		setZoneId((d.getZone()==null)?null:d.getZone().getLocalId());
		setDocumentSolde(d.isDocumentSolde());
	}
}
