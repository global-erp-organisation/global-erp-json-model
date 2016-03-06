package com.camlait.global.erp.domain.model.json.partenaire;

import com.camlait.global.erp.domain.partenaire.ClientComptant;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ClientComptantModel extends ClientModel {

	public ClientComptantModel(ClientComptant c) {
		super(c);
	}

}
