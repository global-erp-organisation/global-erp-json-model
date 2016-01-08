package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;

import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVente;
import com.camlait.global.erp.domain.model.json.enumeration.AutreEnum;
import com.camlait.global.erp.domain.model.json.partenaire.Client;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Zone extends Localisation {

	private Secteur secteur;

	private Collection<DocumentDeVente> documents;

	private Collection<Client> clients;

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}

	public Collection<DocumentDeVente> getDocuments() {
		return documents;
	}

	public void setDocuments(Collection<DocumentDeVente> documents) {
		this.documents = documents;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public Zone() {
		setTypeLocal(AutreEnum.ZONE);
	}
}
