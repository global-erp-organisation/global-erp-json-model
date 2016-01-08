package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.model.json.enumeration.SensOperation;

public class Retrait extends OperationDeCaisse {

    public Retrait(){
        setSensOperation(SensOperation.SORTIE);
    }
}
