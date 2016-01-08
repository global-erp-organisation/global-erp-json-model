package com.camlait.global.erp.domain.model.json.operation.caisse;


import com.camlait.global.erp.domain.model.json.enumeration.SensOperation;


public class Versement extends OperationDeCaisse {

    public Versement(){
        setSensOperation(SensOperation.ENTREE);
    }
}
