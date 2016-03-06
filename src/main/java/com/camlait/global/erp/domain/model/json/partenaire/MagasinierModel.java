package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.inventaire.InventaireModel;
import com.camlait.global.erp.domain.partenaire.Magasinier;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MagasinierModel extends EmployeModel {

	@JsonManagedReference
	private Collection<InventaireModel> inventaireModels;

	public MagasinierModel(Magasinier m) {
		super(m);
	}	
}
