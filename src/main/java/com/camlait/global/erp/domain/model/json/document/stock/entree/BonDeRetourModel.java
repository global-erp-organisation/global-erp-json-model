package com.camlait.global.erp.domain.model.json.document.stock.entree;


import com.camlait.global.erp.domain.document.stock.entree.BonDeRetour;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;


public class BonDeRetourModel extends DocumentEntreeModel {

	public BonDeRetourModel() {
		setTypeDocument(TypeDocuments.BON_DE_RETOUR);
	}
	
	public BonDeRetourModel(BonDeRetour b) {
		super(b);
	}

}
