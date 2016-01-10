package com.camlait.global.erp.domain.model.json.partenaire;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.partenaire.Caissier;

public class CaissierModel extends EmployeModel {

	private Long caisseId;

	private String motDePasse;

	public Long getCaisseId() {
		return caisseId;
	}

	public void setCaisseId(Long caisseId) {
		this.caisseId = caisseId;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public CaissierModel() {
		setTypePartenaire(TypePartenaire.CAISSIER);
	}

	public CaissierModel(Caissier c) {
		super(c);
		setAdresse(c.getAdresse());
		setCaisseId((c.getCaisse()==null)?null:c.getCaisse().getCaisseId());
	}
}
