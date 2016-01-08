package com.camlait.global.erp.domain.model.json.partenaire;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;


public class ClientComptant extends Client {

	public ClientComptant() {
		setTypePartenaire(TypePartenaire.CLIENT_COMPTANT);
	}
}
