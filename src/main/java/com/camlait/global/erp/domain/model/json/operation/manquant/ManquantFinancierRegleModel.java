package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.operation.manquant.ManquantFinancierRegle;

public class ManquantFinancierRegleModel extends ManquantFinancierModel {

    public ManquantFinancierRegleModel(){
        setSensOperation(SensOperation.SORTIE);
    }
    
    public ManquantFinancierRegleModel(ManquantFinancierRegle m){
       super(m);
    }

}
