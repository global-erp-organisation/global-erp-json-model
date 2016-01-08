package com.camlait.global.erp.domain.model.json.entrepot;


import com.camlait.global.erp.domain.enumeration.AutreEnum;

public class MagasinFixe extends Magasin {
    
    private String adresse;
    
    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public MagasinFixe(){
        setTypeMagasin(AutreEnum.MAGASIN_FIXE);
    }
}
