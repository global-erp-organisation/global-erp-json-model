package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.operation.marge.MargeClient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MargeClientModel extends OperationModel {

	private Long clientId;

	public MargeClientModel(MargeClient m) {
		super(m);
		setClientId((m.getPartenaire()==null)?null:m.getPartenaire().getPartenaireId());
	}
}
