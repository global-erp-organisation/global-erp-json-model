package com.camlait.global.erp.domain.model.json.document;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.document.Document;
import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class DocumentModel extends Entite {

	private Long documentId;

	private String codeDocument;

	private Date dateDocument;

	private Long magasinId;

	private Long responsableDocumentId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;
	private SensOperation sensOperation;

	private Long bmqId;

	private Long inventaireId;

	@JsonManagedReference
	private Collection<LigneDeDocumentModel> ligneDocuments;

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

	public Long getMagasinId() {
		return magasinId;
	}

	public void setMagasinId(Long magasinId) {
		this.magasinId = magasinId;
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

	public void setSensOperation(SensOperation sensOperation) {
		this.sensOperation = sensOperation;
	}

	public Long getResponsableDocumentId() {
		return responsableDocumentId;
	}

	public void setResponsableDocumentId(Long responsableDocumentId) {
		this.responsableDocumentId = responsableDocumentId;
	}

	public Long getBmqId() {
		return bmqId;
	}

	public void setBmqId(Long bmqId) {
		this.bmqId = bmqId;
	}

	public Long getInventaireId() {
		return inventaireId;
	}

	public void setInventaireId(Long inventaireId) {
		this.inventaireId = inventaireId;
	}

	public Collection<LigneDeDocumentModel> getLigneDocuments() {
		return ligneDocuments;
	}

	public void setLigneDocuments(Collection<LigneDeDocumentModel> ligneDocuments) {
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
		DocumentModel other = (DocumentModel) obj;
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

	public DocumentModel() {
	}

	public DocumentModel(Document d) {
		setBmqId((d.getBmq() == null) ? null : d.getBmq().getBmqId());
		setCodeDocument(d.getCodeDocument());
		setDateDeCreation(d.getDateDeCreation());
		setDerniereMiseAJour(d.getDerniereMiseAJour());
		setDateDocument(d.getDateDocument());
		setDocumentId(d.getDocumentId());
		setInventaireId((d.getInventaire() == null) ? null : d.getInventaire().getInventaireId());
		setLigneDocuments(getLignes(d));
		setMagasinId((d.getMagasin() == null) ? null : d.getMagasin().getMagasinId());
		setResponsableDocumentId(
				(d.getResponsableDocument() == null) ? null : d.getResponsableDocument().getPartenaireId());
		setSensOperation(d.getSensOperation());
		setTypeDocument(d.getTypeDocument());
	}

	private Collection<LigneDeDocumentModel> getLignes(Document d) {
		Collection<LigneDeDocumentModel> lignes = new HashSet<>();
		d.getLigneDocuments().stream().forEach(l -> {
			lignes.add(new LigneDeDocumentModel(l));
		});
		return lignes;
	}

}
