package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.operation.manquant.ManquantFinancierModel;
import com.camlait.global.erp.domain.partenaire.Vendeur;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class VendeurModel extends EmployeModel {

	private Long zoneDeVenteId;

	@JsonManagedReference
	private Collection<ManquantFinancierModel> manquantFinanciers;

	private boolean recoisDesCommission;

	private double tauxDeCommission;

	public Long getZoneDeVenteId() {
		return zoneDeVenteId;
	}

	public void setZoneDeVenteId(Long zoneDeVenteId) {
		this.zoneDeVenteId = zoneDeVenteId;
	}

	public Collection<ManquantFinancierModel> getManquantFinanciers() {
		return manquantFinanciers;
	}

	public void setManquantFinanciers(Collection<ManquantFinancierModel> manquantFinanciers) {
		this.manquantFinanciers = manquantFinanciers;
	}

	public boolean isRecoisDesCommission() {
		return recoisDesCommission;
	}

	public void setRecoisDesCommission(boolean recoisDesCommission) {
		this.recoisDesCommission = recoisDesCommission;
	}

	public double getTauxDeCommission() {
		return tauxDeCommission;
	}

	public void setTauxDeCommission(double tauxDeCommission) {
		this.tauxDeCommission = tauxDeCommission;
	}

	public VendeurModel() {
		setTypePartenaire(TypePartenaire.VENDEUR);
	}

	public VendeurModel(Vendeur v) {
		super(v);
		setZoneDeVenteId((v.getZoneDeVente()==null)?null:v.getZoneDeVente().getLocalId());
		setManquantFinanciers(getManquantFinanciers(v));
		setTauxDeCommission(v.getTauxDeCommission());
		setRecoisDesCommission(v.isRecoisDesCommission());
	}

	private Collection<ManquantFinancierModel> getManquantFinanciers(Vendeur v) {
		Collection<ManquantFinancierModel> mfs = new HashSet<>();
		v.getManquantFinanciers().stream().forEach(m -> {
			mfs.add(new ManquantFinancierModel(m));
		});
		return mfs;
	}
}
