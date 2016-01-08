package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.enumeration.AutreEnum;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Centre extends Localisation {

    private Collection<Region> regions;

    public Collection<Region> getRegions() {
        return regions;
    }

    public void setRegions(Collection<Region> regions) {
        this.regions = regions;
    }

    public Centre() {
        setTypeLocal(AutreEnum.CENTRE);
    }
}
