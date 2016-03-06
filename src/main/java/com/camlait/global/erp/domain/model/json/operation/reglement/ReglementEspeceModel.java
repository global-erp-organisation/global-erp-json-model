package com.camlait.global.erp.domain.model.json.operation.reglement;

import com.camlait.global.erp.domain.operation.reglement.ReglementEspece;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ReglementEspeceModel extends ModeDeReglementModel {

	public ReglementEspeceModel(ReglementEspece r) {
		super(r);
	}
}
