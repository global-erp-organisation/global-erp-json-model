package com.camlait.global.erp.domain.model.json.operation.reglement;

import java.util.Collection;
import java.util.stream.Collectors;

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
		return r.getFactureReglements().stream().map(f->{
		    return new FactureReglementModel(f);
		}).collect(Collectors.toList());
	}

}
