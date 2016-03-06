package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.operation.caisse.Versement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class VersementModel extends OperationDeCaisseModel {

	public VersementModel(Versement v){
        super(v);
    }

}
