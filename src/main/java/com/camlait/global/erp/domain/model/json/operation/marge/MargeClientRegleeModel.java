package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.operation.marge.MargeClientReglee;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class MargeClientRegleeModel extends MargeClientModel {

	public MargeClientRegleeModel(MargeClientReglee m) {
		super(m);
	}
}
