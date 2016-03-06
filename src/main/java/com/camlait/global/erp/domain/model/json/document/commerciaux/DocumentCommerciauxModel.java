package com.camlait.global.erp.domain.model.json.document.commerciaux;

import com.camlait.global.erp.domain.document.commerciaux.DocumentCommerciaux;
import com.camlait.global.erp.domain.model.json.document.DocumentModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DocumentCommerciauxModel extends DocumentModel {

	public DocumentCommerciauxModel(DocumentCommerciaux d) {
		super(d);
	}
}
