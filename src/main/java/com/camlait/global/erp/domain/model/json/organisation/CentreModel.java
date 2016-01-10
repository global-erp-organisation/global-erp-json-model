package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.enumeration.AutreEnum;
import com.camlait.global.erp.domain.organisation.Centre;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class CentreModel extends LocalisationModel {

	@JsonManagedReference
	private Collection<RegionModel> regionModels;

	public Collection<RegionModel> getRegions() {
		return regionModels;
	}

	public void setRegions(Collection<RegionModel> regionModels) {
		this.regionModels = regionModels;
	}

	public CentreModel() {
		setTypeLocal(AutreEnum.CENTRE);
	}

	public CentreModel(Centre c) {
		super(c);
		setRegions(getRegion(c));
	}

	private Collection<RegionModel> getRegion(Centre c) {
		Collection<RegionModel> regions = new HashSet<>();
		c.getRegions().stream().forEach(r -> {
			regions.add(new RegionModel(r));
		});
		return regions;
	}
}
