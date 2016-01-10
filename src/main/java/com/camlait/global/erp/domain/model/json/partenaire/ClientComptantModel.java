package com.camlait.global.erp.domain.model.json.partenaire;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.partenaire.ClientComptant;

public class ClientComptantModel extends ClientModel {

	public ClientComptantModel() {
		setTypePartenaire(TypePartenaire.CLIENT_COMPTANT);
	}

	public ClientComptantModel(ClientComptant c) {
		super(c);
	}

}
