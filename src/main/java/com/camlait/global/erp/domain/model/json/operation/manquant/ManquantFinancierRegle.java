package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.enumeration.SensOperation;

public class ManquantFinancierRegle extends ManquantFinancier {

    public ManquantFinancierRegle(){
        setSensOperation(SensOperation.SORTIE);
    }
}
