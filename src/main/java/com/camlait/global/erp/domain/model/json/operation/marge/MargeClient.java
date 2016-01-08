package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.model.json.operation.Operation;
import com.camlait.global.erp.domain.model.json.partenaire.ClientAmarge;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class MargeClient extends Operation {

	private ClientAmarge client;

	public ClientAmarge getClient() {
		return client;
	}

	public void setClient(ClientAmarge client) {
		this.client = client;
	}
	
}
