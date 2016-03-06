package com.camlait.global.erp.domain.model.json.operation.reglement;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.model.json.operation.reglement.lettrage.FactureReglementModel;
import com.camlait.global.erp.domain.operation.reglement.Reglement;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ReglementModel extends OperationModel {

	@JsonManagedReference
	private Collection<FactureReglementModel> factureReglements;

	private Long modeDeReglementId;

	public ReglementModel(Reglement r) {
		super(r);
		setFactureReglements(getFacture(r));
	}

	private Collection<FactureReglementModel> getFacture(Reglement r) {
		Collection<FactureReglementModel> fs = new HashSet<>();
		r.getFactureReglements().stream().forEach(f -> {
			fs.add(new FactureReglementModel(f));
		});
		return fs;
	}

}
