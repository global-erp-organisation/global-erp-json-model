package com.camlait.global.erp.domain.model.json.document.stock.sortie;

import com.camlait.global.erp.domain.document.stock.sortie.Animation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;

public class AnimationModel extends DocumentDeSortieModel {
	public AnimationModel() {
		setTypeDocument(TypeDocuments.ANIMATION);
	}

	public AnimationModel(Animation a) {
		super(a);
	}

}
