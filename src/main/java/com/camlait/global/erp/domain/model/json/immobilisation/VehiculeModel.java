package com.camlait.global.erp.domain.model.json.immobilisation;

import com.camlait.global.erp.domain.immobilisation.Vehicule;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class VehiculeModel extends ImmobilisationModel {

	private String immatriculation;

	private String marque;


	public VehiculeModel(Vehicule v) {
		super(v);
		setImmatriculation(v.getImmatriculation());
		setMarque(v.getMarque());
	}
}
