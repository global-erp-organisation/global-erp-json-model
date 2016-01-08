package com.camlait.global.erp.domain.model.json.document;

import java.util.Collection;
import java.util.Date;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.bmq.Bmq;
import com.camlait.global.erp.domain.model.json.entrepot.Magasin;
import com.camlait.global.erp.domain.model.json.inventaire.Inventaire;
import com.camlait.global.erp.domain.model.json.partenaire.Employe;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public abstract class Document extends Entite {

	private Long documentId;

	private String codeDocument;

	private Date dateDocument;

	private Magasin magasin;

	private Employe responsableDocument;

	private Date dateDeCreation;

	private Date derniereMiseAJour;
	private SensOperation sensOperation;

	private Bmq bmq;

	private Inventaire inventaire;

	private Collection<LigneDeDocument> ligneDocuments;

	private TypeDocuments typeDocument;

	
	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public String getCodeDocument() {
		return codeDocument;
	}

	public void setCodeDocument(String codeDocument) {
		this.codeDocument = codeDocument;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public Employe getResponsableDocument() {
		return responsableDocument;
	}

	public void setResponsableDocument(Employe responsableDocument) {
		this.responsableDocument = responsableDocument;
	}

	public Date getDateDocument() {
		return dateDocument;
	}

	public void setDateDocument(Date dateDocument) {
		this.dateDocument = dateDocument;
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

	public SensOperation getSensOperation() {
		return sensOperation;
	}

	public Bmq getBmq() {
		return bmq;
	}

	public void setBmq(Bmq bmq) {
		this.bmq = bmq;
	}

	public void setSensOperation(SensOperation sensOperation) {
		this.sensOperation = sensOperation;
	}

	public Inventaire getInventaire() {
		return inventaire;
	}

	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}

	public Collection<LigneDeDocument> getLigneDocuments() {
		return ligneDocuments;
	}

	public void setLigneDocuments(Collection<LigneDeDocument> ligneDocuments) {
		this.ligneDocuments = ligneDocuments;
	}

	public TypeDocuments getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(TypeDocuments typeDocument) {
		this.typeDocument = typeDocument;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documentId == null) ? 0 : documentId.hashCode());
		result = prime * result + ((codeDocument == null) ? 0 : codeDocument.hashCode());
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
		Document other = (Document) obj;
		if (documentId == null) {
			if (other.documentId != null)
				return false;
		} else if (!documentId.equals(other.documentId))
			return false;
		if (codeDocument == null) {
			if (other.codeDocument != null)
				return false;
		} else if (!codeDocument.equals(other.codeDocument))
			return false;
		return true;
	}

	public Document() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}
}
