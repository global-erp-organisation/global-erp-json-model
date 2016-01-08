package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.Document;
import com.camlait.global.erp.domain.model.json.entrepot.Magasin;
import com.camlait.global.erp.domain.model.json.operation.Recouvrement;
import com.camlait.global.erp.domain.model.json.partenaire.Employe;
import com.camlait.global.erp.domain.model.json.partenaire.Vendeur;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Bmq extends Entite {

	private Long bmqId;

	private String codeBmq;

	private Date dateBmq;
	private Vendeur vendeur;

	private Magasin magasin;

	private Collection<Document> documents;

	private Collection<Recouvrement> recouvrements;

	private Collection<LigneBmq> ligneBmqs;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private boolean bmqClos;

	private Employe responsable;

	public Long getBmqId() {
		return bmqId;
	}

	public void setBmqId(Long bmqId) {
		this.bmqId = bmqId;
	}

	public String getCodeBmq() {
		return codeBmq;
	}

	public void setCodeBmq(String codeBmq) {
		this.codeBmq = codeBmq;
	}

	public Date getDateBmq() {
		return dateBmq;
	}

	public void setDateBmq(Date dateBmq) {
		this.dateBmq = dateBmq;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public Collection<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Collection<Document> documents) {
		this.documents = documents;
	}

	public Collection<Recouvrement> getRecouvrements() {
		return recouvrements;
	}

	public void setRecouvrements(Collection<Recouvrement> recouvrements) {
		this.recouvrements = recouvrements;
	}

	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public Date getDerniereMiseAJour() {
		return derniereMiseAJour;
	}

	public void setDerniereMiseAJour(Date derniereMiseAJour) {
		this.derniereMiseAJour = derniereMiseAJour;
	}

	public Collection<LigneBmq> getLigneBmqs() {
		return ligneBmqs;
	}

	public void setLigneBmqs(Collection<LigneBmq> ligneBmqs) {
		this.ligneBmqs = ligneBmqs;
	}

	public boolean isBmqClos() {
		return bmqClos;
	}

	public void setBmqClos(boolean bmqClos) {
		this.bmqClos = bmqClos;
	}

	public Employe getResponsable() {
		return responsable;
	}

	public void setResponsable(Employe responsable) {
		this.responsable = responsable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bmqId == null) ? 0 : bmqId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bmq other = (Bmq) obj;
		if (bmqId == null) {
			if (other.bmqId != null)
				return false;
		} else if (!bmqId.equals(other.bmqId))
			return false;
		return true;
	}

	public Bmq() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}
}
