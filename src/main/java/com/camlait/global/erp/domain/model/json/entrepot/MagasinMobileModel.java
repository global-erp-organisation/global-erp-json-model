package com.camlait.global.erp.domain.model.json.entrepot;


import com.camlait.global.erp.domain.entrepot.MagasinMobile;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MagasinMobileModel extends MagasinModel {
    
    public MagasinMobileModel(MagasinMobile m) {
        super(m);
    }

}
