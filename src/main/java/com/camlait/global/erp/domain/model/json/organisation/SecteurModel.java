package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.enumeration.AutreEnum;
import com.camlait.global.erp.domain.organisation.Secteur;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class SecteurModel extends LocalisationModel {

	private Long regionId;

	@JsonManagedReference
	private Collection<ZoneModel> zoneModels;

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public Collection<ZoneModel> getZoneModels() {
		return zoneModels;
	}

	public void setZoneModels(Collection<ZoneModel> zoneModels) {
		this.zoneModels = zoneModels;
	}

	public SecteurModel() {
		setTypeLocal(AutreEnum.SECTEUR);
	}

	public SecteurModel(Secteur s) {
		super(s);
		setRegionId((s.getRegion()==null)?null:s.getRegion().getLocalId());
		setZoneModels(getZones(s));
	}

	private Collection<ZoneModel> getZones(Secteur s) {
		Collection<ZoneModel> zones = new HashSet<>();
		s.getZones().stream().forEach(z -> {
			zones.add(new ZoneModel(z));
		});
		return zones;
	}
}
