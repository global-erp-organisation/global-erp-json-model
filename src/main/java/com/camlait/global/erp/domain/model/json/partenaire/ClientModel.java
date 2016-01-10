package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVenteModel;
import com.camlait.global.erp.domain.partenaire.Client;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class ClientModel extends PartenaireModel {

	private Long zoneId;

	@JsonManagedReference
	private Collection<DocumentDeVenteModel> documentDeVenteModels;

	private String description;

	private boolean clientAristourne;

	private double ristourne;

	public Collection<DocumentDeVenteModel> getDocumentDeVentes() {
		return documentDeVenteModels;
	}

	public void setDocumentDeVentes(Collection<DocumentDeVenteModel> documentDeVenteModels) {
		this.documentDeVenteModels = documentDeVenteModels;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isClientAristourne() {
		return clientAristourne;
	}

	public void setClientAristourne(boolean clientAristourne) {
		this.clientAristourne = clientAristourne;
	}

	public double getRistourne() {
		return ristourne;
	}

	public void setRistourne(double ristourne) {
		this.ristourne = ristourne;
	}

	public Long getZoneId() {
		return zoneId;
	}

	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
	}

	public Collection<DocumentDeVenteModel> getDocumentDeVenteModels() {
		return documentDeVenteModels;
	}

	public void setDocumentDeVenteModels(Collection<DocumentDeVenteModel> documentDeVenteModels) {
		this.documentDeVenteModels = documentDeVenteModels;
	}

	public ClientModel() {
		setTypePartenaire(TypePartenaire.CLIENT);
	}

	public ClientModel(Client c) {
		super(c);
		setDocumentDeVenteModels(getDocs(c));
		setZoneId((c.getZone()==null)?null:c.getZone().getLocalId());
		setRistourne(c.getRistourne());
		setClientAristourne(c.isClientAristourne());
		setDescription(c.getDescription());
	}

	private Collection<DocumentDeVenteModel> getDocs(Client c) {
		Collection<DocumentDeVenteModel> ds = new HashSet<>();
		c.getDocumentDeVentes().stream().forEach(d -> {
			ds.add(new DocumentDeVenteModel(d));
		});
		return ds;
	}
}
