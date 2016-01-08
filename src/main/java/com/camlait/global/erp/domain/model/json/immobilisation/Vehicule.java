package com.camlait.global.erp.domain.model.json.immobilisation;

public class Vehicule extends Immobilisation {


    private String immatriculation;

    private String marque;

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Vehicule() {

    }
}
