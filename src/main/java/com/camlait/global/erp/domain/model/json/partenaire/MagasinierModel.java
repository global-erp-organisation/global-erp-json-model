package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.inventaire.InventaireModel;
import com.camlait.global.erp.domain.partenaire.Magasinier;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class MagasinierModel extends EmployeModel {

	@JsonManagedReference
	private Collection<InventaireModel> inventaireModels;

	public Collection<InventaireModel> getInventaires() {
		return inventaireModels;
	}

	public void setInventaires(Collection<InventaireModel> inventaireModels) {
		this.inventaireModels = inventaireModels;
	}

	public MagasinierModel() {
		setTypePartenaire(TypePartenaire.MAGASINIER);
	}

	public MagasinierModel(Magasinier m) {
		super(m);
	}	
}
