package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.operation.marge.MargeClientModel;
import com.camlait.global.erp.domain.partenaire.ClientAmarge;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ClientAmargeModel extends ClientModel {

	@JsonManagedReference
	private Collection<MargeClientModel> margeClientModels;


	public ClientAmargeModel(ClientAmarge c) {
		super(c);
		setMargeClientModels(getMarges(c));
	}

	private Collection<MargeClientModel> getMarges(ClientAmarge c) {
		Collection<MargeClientModel> ms = new HashSet<>();
		c.getMargeClients().stream().forEach(m -> {
			ms.add(new MargeClientModel(m));
		});
		return ms;
	}
}
