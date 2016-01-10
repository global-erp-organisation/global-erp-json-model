package com.camlait.global.erp.domain.model.json.entrepot;

import com.camlait.global.erp.domain.entrepot.MagasinFixe;
import com.camlait.global.erp.domain.enumeration.AutreEnum;

public class MagasinFixeModel extends MagasinModel {

	private String adresse;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public MagasinFixeModel() {
		setTypeMagasin(AutreEnum.MAGASIN_FIXE);
	}

	public MagasinFixeModel(MagasinFixe m) {
		super(m);
	}

}
