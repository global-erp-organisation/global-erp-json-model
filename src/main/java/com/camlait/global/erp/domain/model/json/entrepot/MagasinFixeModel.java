package com.camlait.global.erp.domain.model.json.entrepot;

import com.camlait.global.erp.domain.entrepot.MagasinFixe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MagasinFixeModel extends MagasinModel {

	private String adresse;

	public MagasinFixeModel(MagasinFixe m) {
		super(m);
	}

}
