package com.camlait.global.erp.domain.model.json.operation.caisse;

import com.camlait.global.erp.domain.operation.caisse.Retrait;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class RetraitModel extends OperationDeCaisseModel {

	public RetraitModel(Retrait r) {
		super(r);
	}
}
