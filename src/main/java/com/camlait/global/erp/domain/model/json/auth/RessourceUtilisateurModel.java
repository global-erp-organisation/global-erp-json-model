package com.camlait.global.erp.domain.model.json.auth;

import java.util.Date;

import com.camlait.global.erp.domain.auth.RessourceUtilisateur;
import com.camlait.global.erp.domain.enumeration.Etat;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class RessourceUtilisateurModel extends Entite {

	private Long ressourceUtilisateurId;

	private String codeUtilisateur;

	private Long ressourceId;

	private Etat etat;

	private Date dateDeCreation;

	private Date derniereMiseAJour;


	public RessourceUtilisateurModel(RessourceUtilisateur ru) {
		setCodeUtilisateur((ru.getUtilisateur() == null) ? null : ru.getUtilisateur().getCodeUtilisateur());
		setDateDeCreation(ru.getDateDeCreation());
		setDerniereMiseAJour(ru.getDerniereMiseAJour());
		setEtat(ru.getEtat());
		setRessourceId((ru.getRessource() == null) ? null : ru.getRessource().getRessourceId());
		setRessourceUtilisateurId(ru.getRessourceUtilisateurId());
	}

}
