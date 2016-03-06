package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.auth.Groupe;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Builder
public class GroupeModel extends Entite {

	private Long groupeId;

	private String descriptionGroupe;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	@JsonManagedReference
	private Collection<GroupeUtilisateurModel> groupeUtilisateurModels;

	public GroupeModel(Groupe g) {
		setDescriptionGroupe(g.getDescriptionGroupe());
		setGroupeId(g.getGroupeId());
		setDateDeCreation(g.getDateDeCreation());
		setDerniereMiseAJour(g.getDerniereMiseAJour());
		setGroupeUtilisateurModels(getGu(g));
	}

	public static GroupeModel createGroupeModel(Groupe g) {
		return builder().descriptionGroupe(g.getDescriptionGroupe()).groupeId(g.getGroupeId())
				.dateDeCreation(g.getDateDeCreation()).derniereMiseAJour(g.getDerniereMiseAJour())
				.groupeUtilisateurModels(getGu(g)).build();

	}

	private static Collection<GroupeUtilisateurModel> getGu(Groupe g) {
		final Collection<GroupeUtilisateurModel> gus = new HashSet<>();
		g.getGroupeUtilisateurs().stream().forEach(gu -> {
			gus.add(new GroupeUtilisateurModel(gu));
		});
		return gus;
	}

	public GroupeModel(Long groupeId, String descriptionGroupe, Date dateDeCreation, Date derniereMiseAJour,
			Collection<GroupeUtilisateurModel> groupeUtilisateurModels) {
		super();
		this.groupeId = groupeId;
		this.descriptionGroupe = descriptionGroupe;
		this.dateDeCreation = dateDeCreation;
		this.derniereMiseAJour = derniereMiseAJour;
		this.groupeUtilisateurModels = groupeUtilisateurModels;
	}
}