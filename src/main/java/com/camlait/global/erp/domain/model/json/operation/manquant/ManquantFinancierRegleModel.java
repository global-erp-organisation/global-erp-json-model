package com.camlait.global.erp.domain.model.json.operation.manquant;

import com.camlait.global.erp.domain.operation.manquant.ManquantFinancierRegle;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ManquantFinancierRegleModel extends ManquantFinancierModel {

     
    public ManquantFinancierRegleModel(ManquantFinancierRegle m){
       super(m);
    }

}
