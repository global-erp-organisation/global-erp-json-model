package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.auth.Ressource;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class RessourceModel extends Entite {

	private Long ressourceId;
	private Long ressourceParentId;

	private String title;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private String icon;

	private String sref;

	private String href;

	private Integer ordre;

	@JsonManagedReference
	private Collection<RessourceModel> items;

	public RessourceModel(Ressource r) {
		setDateDeCreation(r.getDateDeCreation());
		setDerniereMiseAJour(r.getDerniereMiseAJour());
		setTitle(r.getTitle());
		setRessourceId(r.getRessourceId());
		setRessourceParentId((r.getRessourceParent() == null) ? null : r.getRessourceParent().getRessourceId());
		setSref(r.getSref());
		setIcon(r.getIcon());
		setItems(getItems(r));
		setHref(r.getHref());
		setOrdre(r.getOrdre());
	}

	private Collection<RessourceModel> getItems(Ressource r) {
		return r.getItems().stream().map(rs->{
		    return new RessourceModel(rs);
		}).collect(Collectors.toList());
	}
}
