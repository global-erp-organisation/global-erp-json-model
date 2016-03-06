package com.camlait.global.erp.domain.model.json.operation.marge;

import com.camlait.global.erp.domain.operation.marge.MargeClient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MargeClientDuModel extends MargeClientModel {

	public MargeClientDuModel(MargeClient m) {
		super(m);
	}
}
