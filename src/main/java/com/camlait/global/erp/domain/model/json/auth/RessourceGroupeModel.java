package com.camlait.global.erp.domain.model.json.auth;

import java.util.Date;

import com.camlait.global.erp.domain.auth.RessourceGroupe;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class RessourceGroupeModel extends Entite {

	private Long resourceGroupeId;

	private Long groupeId;

	private Long ressourceId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public RessourceGroupeModel(RessourceGroupe rg) {
		setDateDeCreation(rg.getDateDeCreation());
		setDerniereMiseAJour(rg.getDerniereMiseAJour());
		setGroupeId(rg.getGroupe().getGroupeId());
		setResourceGroupeId(rg.getResourceGroupeId());
		setRessourceId((rg.getRessource() == null) ? null : rg.getRessource().getRessourceId());
	}
}
