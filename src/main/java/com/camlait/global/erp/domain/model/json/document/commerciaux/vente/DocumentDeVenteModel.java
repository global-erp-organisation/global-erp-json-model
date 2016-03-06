package com.camlait.global.erp.domain.model.json.document.commerciaux.vente;

import com.camlait.global.erp.domain.document.commerciaux.vente.DocumentDeVente;
import com.camlait.global.erp.domain.model.json.document.commerciaux.DocumentCommerciauxModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DocumentDeVenteModel extends DocumentCommerciauxModel {

	private Long clientId;

	private Long zoneId;

	private boolean documentSolde;

	public DocumentDeVenteModel(DocumentDeVente d) {
		super(d);
		setClientId((d.getClient()==null)?null:d.getClient().getPartenaireId());
		setZoneId((d.getZone()==null)?null:d.getZone().getLocalId());
		setDocumentSolde(d.isDocumentSolde());
	}
}
