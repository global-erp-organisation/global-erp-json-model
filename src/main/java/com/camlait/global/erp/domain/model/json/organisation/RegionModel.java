package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.organisation.Region;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class RegionModel extends LocalisationModel {

	private Long centreId;

	@JsonManagedReference
	private Collection<SecteurModel> secteurModels;

	public RegionModel(Region r) {
		super(r);
		setCentreId((r.getCentre()==null)?null:r.getCentre().getLocalId());
		setSecteurModels(getSecteurs(r));
	}


	private Collection<SecteurModel> getSecteurs(Region r) {
		Collection<SecteurModel> secteurs = new HashSet<>();
		r.getSecteurs().stream().forEach(s -> {
			secteurs.add(new SecteurModel(s));
		});
		return secteurs;
	}

}
