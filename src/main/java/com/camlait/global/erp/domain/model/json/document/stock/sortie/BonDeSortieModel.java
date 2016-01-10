package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.document.stock.sortie.BonDeSortie;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class BonDeSortieModel extends DocumentDeSortieModel {
    
    public BonDeSortieModel() {
        setTypeDocument(TypeDocuments.BON_DE_SORTIE);
    }
    
    public BonDeSortieModel(BonDeSortie b) {
        super(b);
    }

}
