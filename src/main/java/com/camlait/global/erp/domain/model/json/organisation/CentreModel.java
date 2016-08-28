package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.organisation.Centre;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CentreModel extends LocalisationModel {

    @JsonManagedReference
    private Collection<RegionModel> regionModels;

    public CentreModel(Centre c) {
        super(c);
        setRegionModels(getRegion(c));
    }

    private Collection<RegionModel> getRegion(Centre c) {
        return c.getRegions().stream().map(r -> {
            return new RegionModel(r);
        }).collect(Collectors.toList());
    }
}
