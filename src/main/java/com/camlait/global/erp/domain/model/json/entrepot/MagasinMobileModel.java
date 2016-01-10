package com.camlait.global.erp.domain.model.json.entrepot;


import com.camlait.global.erp.domain.entrepot.MagasinMobile;
import com.camlait.global.erp.domain.enumeration.AutreEnum;

public class MagasinMobileModel extends MagasinModel {
    
    public MagasinMobileModel() {
        setTypeMagasin(AutreEnum.MAGASIN_MOBILE);
    }
    public MagasinMobileModel(MagasinMobile m) {
        super(m);
    }

}
