package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.organisation.Secteur;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class SecteurModel extends LocalisationModel {

    private Long regionId;

    @JsonManagedReference
    private Collection<ZoneModel> zoneModels;

    public SecteurModel(Secteur s) {
        super(s);
        setRegionId((s.getRegion() == null) ? null : s.getRegion().getLocalId());
        setZoneModels(getZones(s));
    }

    private Collection<ZoneModel> getZones(Secteur s) {
        return s.getZones().stream().map(z -> {
            return new ZoneModel(z);
        }).collect(Collectors.toList());
    }
}
