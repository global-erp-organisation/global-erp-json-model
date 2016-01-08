package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.model.json.enumeration.SensOperation;


public class MargeClientReglee extends MargeClient {

    public MargeClientReglee(){
        setSensOperation(SensOperation.SORTIE);
    }
}
