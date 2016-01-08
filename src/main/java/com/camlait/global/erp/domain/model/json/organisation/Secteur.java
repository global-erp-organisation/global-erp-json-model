package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.enumeration.AutreEnum;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Secteur extends Localisation {

     private Region region;

     private Collection<Zone> zones;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Collection<Zone> getZones() {
        return zones;
    }

    public void setZones(Collection<Zone> zones) {
        this.zones = zones;
    }

    public Secteur() {
        setTypeLocal(AutreEnum.SECTEUR);
    }
}
