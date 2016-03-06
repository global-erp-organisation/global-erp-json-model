package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.document.stock.sortie.BonDeSortie;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class BonDeSortieModel extends DocumentDeSortieModel {
        
    public BonDeSortieModel(BonDeSortie b) {
        super(b);
    }

}
