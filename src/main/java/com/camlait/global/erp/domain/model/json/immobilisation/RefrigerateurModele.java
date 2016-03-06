package com.camlait.global.erp.domain.model.json.immobilisation;

import com.camlait.global.erp.domain.immobilisation.Refrigerateur;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class RefrigerateurModele extends ImmobilisationModel {

	private String numeroDeSerie;

	private String marque;

	public RefrigerateurModele(Refrigerateur r) {
		super(r);
		setNumeroDeSerie(r.getNumeroDeSerie());
		setMarque(r.getMarque());
	}
}
