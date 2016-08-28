package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.model.json.operation.manquant.ManquantFinancierModel;
import com.camlait.global.erp.domain.partenaire.Vendeur;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class VendeurModel extends EmployeModel {

	private Long zoneDeVenteId;

	@JsonManagedReference
	private Collection<ManquantFinancierModel> manquantFinanciers;

	private boolean recoisDesCommission;

	private double tauxDeCommission;

	public VendeurModel(Vendeur v) {
		super(v);
		setZoneDeVenteId((v.getZoneDeVente() == null) ? null : v.getZoneDeVente().getLocalId());
		setManquantFinanciers(getManquantFinanciers(v));
		setTauxDeCommission(v.getTauxDeCommission());
		setRecoisDesCommission(v.isRecoisDesCommission());
	}

	private Collection<ManquantFinancierModel> getManquantFinanciers(Vendeur v) {
		return v.getManquantFinanciers().stream().map(m->{
		    return new ManquantFinancierModel(m);
		}).collect(Collectors.toList());
	}
}
