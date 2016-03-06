package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVenteModel;
import com.camlait.global.erp.domain.partenaire.Client;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ClientModel extends PartenaireModel {

	private Long zoneId;

	@JsonManagedReference
	private Collection<DocumentDeVenteModel> documentDeVenteModels;

	private String description;

	private boolean clientAristourne;

	private double ristourne;

	public ClientModel(Client c) {
		super(c);
		setDocumentDeVenteModels(getDocs(c));
		setZoneId((c.getZone() == null) ? null : c.getZone().getLocalId());
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
