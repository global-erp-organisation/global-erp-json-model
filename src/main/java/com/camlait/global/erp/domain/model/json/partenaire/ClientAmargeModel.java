package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.operation.marge.MargeClientModel;
import com.camlait.global.erp.domain.partenaire.ClientAmarge;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class ClientAmargeModel extends ClientModel {

	@JsonManagedReference
	private Collection<MargeClientModel> margeClientModels;

	public Collection<MargeClientModel> getMargeClients() {
		return margeClientModels;
	}

	public void setMargeClients(Collection<MargeClientModel> margeClientModels) {
		this.margeClientModels = margeClientModels;
	}

	public ClientAmargeModel() {
		setTypePartenaire(TypePartenaire.CLIENT_A_MARGE);
	}

	public ClientAmargeModel(ClientAmarge c) {
		super(c);
		setMargeClients(getMarges(c));
	}

	private Collection<MargeClientModel> getMarges(ClientAmarge c) {
		Collection<MargeClientModel> ms = new HashSet<>();
		c.getMargeClients().stream().forEach(m -> {
			ms.add(new MargeClientModel(m));
		});
		return ms;
	}
}
