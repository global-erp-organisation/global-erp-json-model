package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVenteModel;
import com.camlait.global.erp.domain.model.json.partenaire.ClientModel;
import com.camlait.global.erp.domain.organisation.Zone;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ZoneModel extends LocalisationModel {

	private Long secteurId;

	@JsonManagedReference
	private Collection<DocumentDeVenteModel> documents;

	@JsonManagedReference
	private Collection<ClientModel> clientModels;

	public ZoneModel(Zone z) {
		super(z);
		setClientModels(gestClients(z));
		setDocuments(getDocuments(z));
		setSecteurId((z.getSecteur() == null) ? null : z.getSecteur().getLocalId());
	}

	private Collection<DocumentDeVenteModel> getDocuments(Zone z) {
		Collection<DocumentDeVenteModel> docs = new HashSet<>();
		z.getDocuments().stream().forEach(d -> {
			docs.add(new DocumentDeVenteModel(d));
		});
		return docs;
	}

	private Collection<ClientModel> gestClients(Zone z) {
		Collection<ClientModel> clients = new HashSet<>();
		z.getClients().stream().forEach(c -> {
			clients.add(new ClientModel(c));
		});
		return clients;
	}
}
