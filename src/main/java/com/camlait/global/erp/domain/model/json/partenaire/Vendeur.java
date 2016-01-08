package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.operation.manquant.ManquantFinancier;
import com.camlait.global.erp.domain.model.json.organisation.Zone;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Vendeur extends Employe {
    
    private Zone zoneDeVente;
    
    private Collection<ManquantFinancier> manquantFinanciers;
    
    private boolean recoisDesCommission;
    
    private double tauxDeCommission;
    
    public Zone getZoneDeVente() {
        return zoneDeVente;
    }
    
    public void setZoneDeVente(Zone zoneDeVente) {
        this.zoneDeVente = zoneDeVente;
    }
    
    public Collection<ManquantFinancier> getManquantFinanciers() {
        return manquantFinanciers;
    }
    
    public void setManquantFinanciers(Collection<ManquantFinancier> manquantFinanciers) {
        this.manquantFinanciers = manquantFinanciers;
    }
    
    public boolean isRecoisDesCommission() {
        return recoisDesCommission;
    }
    
    public void setRecoisDesCommission(boolean recoisDesCommission) {
        this.recoisDesCommission = recoisDesCommission;
    }
    
    public double getTauxDeCommission() {
        return tauxDeCommission;
    }
    
    public void setTauxDeCommission(double tauxDeCommission) {
        this.tauxDeCommission = tauxDeCommission;
    }
    
    public Vendeur() {
        setTypePartenaire(TypePartenaire.VENDEUR);
    }
}
