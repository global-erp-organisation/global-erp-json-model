package com.camlait.global.erp.domain.model.json.partenaire;

import com.camlait.global.erp.domain.partenaire.Caissier;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CaissierModel extends EmployeModel {

	private Long caisseId;

	private String motDePasse;

	public CaissierModel(Caissier c) {
		super(c);
		setAdresse(c.getAdresse());
		setCaisseId((c.getCaisse() == null) ? null : c.getCaisse().getCaisseId());
	}
}
