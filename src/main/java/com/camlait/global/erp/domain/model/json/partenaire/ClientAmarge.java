package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.operation.marge.MargeClient;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class ClientAmarge extends Client {

	private Collection<MargeClient> margeClients;

	public Collection<MargeClient> getMargeClients() {
		return margeClients;
	}

	public void setMargeClients(Collection<MargeClient> margeClients) {
		this.margeClients = margeClients;
	}
	
	public ClientAmarge(){
		setTypePartenaire(TypePartenaire.CLIENT_A_MARGE);
	}
}
