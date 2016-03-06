package com.camlait.global.erp.domain.model.json.auth;

import java.util.Date;

import com.camlait.global.erp.domain.auth.GroupeUtilisateur;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class GroupeUtilisateurModel extends Entite {

	private Long groupeUtilissateurId;
	private Long groupeId;

	private String codeUtilisateur;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public GroupeUtilisateurModel(GroupeUtilisateur gu) {
		setDateDeCreation(gu.getDateDeCreation());
		setDerniereMiseAJour(gu.getDerniereMiseAJour());
		setGroupeId((gu.getGroupe() == null) ? null : gu.getGroupe().getGroupeId());
		setGroupeUtilissateurId(gu.getGroupeUtilissateurId());
		setCodeUtilisateur((gu.getUtilsateur() == null) ? null : gu.getUtilsateur().getCodeUtilisateur());
	}

}
