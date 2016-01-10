package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.operation.caisse.Versement;

public class VersementModel extends OperationDeCaisseModel {

	public VersementModel() {
		setSensOperation(SensOperation.ENTREE);
	}

	public VersementModel(Versement v){
        super(v);
    }

}
