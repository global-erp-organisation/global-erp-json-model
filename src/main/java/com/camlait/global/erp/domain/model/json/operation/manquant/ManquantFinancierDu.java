package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.enumeration.SensOperation;


public class ManquantFinancierDu extends ManquantFinancier {

    public ManquantFinancierDu(){
        setSensOperation(SensOperation.ENTREE);
    }
}
