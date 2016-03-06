package com.camlait.global.erp.domain.model.json.operation.reglement;

import com.camlait.global.erp.domain.operation.reglement.ReglementParCheque;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ReglementParChequeModel extends ModeDeReglementModel {

	public ReglementParChequeModel(ReglementParCheque r) {
		super(r);
	}
}
