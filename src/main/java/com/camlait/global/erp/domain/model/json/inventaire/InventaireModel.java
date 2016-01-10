package com.camlait.global.erp.domain.model.json.inventaire;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.inventaire.Inventaire;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.DocumentModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class InventaireModel extends Entite {

	private Long inventaireId;

	private String codeInventaire;

	private Date dateInventaire;

	private String note;

	private Long magasinId;

	private Long magasinierSortantId;

	private Long magasinierEntrantId;

	private boolean inventaireClos;

	@JsonManagedReference
	private Collection<DocumentModel> documentModels;

	@JsonManagedReference
	private Collection<LigneInventaireModel> ligneInventaireModels;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public String getCodeInventaire() {
		return codeInventaire;
	}

	public void setCodeInventaire(String codeInventaire) {
		this.codeInventaire = codeInventaire;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getMagasinId() {
		return magasinId;
	}

	public void setMagasinId(Long magasinId) {
		this.magasinId = magasinId;
	}

	public Long getMagasinierSortantId() {
		return magasinierSortantId;
	}

	public void setMagasinierSortantId(Long magasinierSortantId) {
		this.magasinierSortantId = magasinierSortantId;
	}

	public Long getMagasinierEntrantId() {
		return magasinierEntrantId;
	}

	public void setMagasinierEntrantId(Long magasinierEntrantId) {
		this.magasinierEntrantId = magasinierEntrantId;
	}

	public Collection<DocumentModel> getDocumentModels() {
		return documentModels;
	}

	public void setDocumentModels(Collection<DocumentModel> documentModels) {
		this.documentModels = documentModels;
	}

	public Collection<LigneInventaireModel> getLigneInventaireModels() {
		return ligneInventaireModels;
	}

	public void setLigneInventaireModels(Collection<LigneInventaireModel> ligneInventaireModels) {
		this.ligneInventaireModels = ligneInventaireModels;
	}

	public boolean isInventaireClos() {
		return inventaireClos;
	}

	public void setInventaireClos(boolean inventaireClos) {
		this.inventaireClos = inventaireClos;
	}

	public Collection<DocumentModel> getDocuments() {
		return documentModels;
	}

	public void setDocuments(Collection<DocumentModel> documentModels) {
		this.documentModels = documentModels;
	}

	public Collection<LigneInventaireModel> getLigneInventaires() {
		return ligneInventaireModels;
	}

	public void setLigneInventaires(Collection<LigneInventaireModel> ligneInventaireModels) {
		this.ligneInventaireModels = ligneInventaireModels;
	}

	public Long getInventaireId() {
		return inventaireId;
	}

	public void setInventaireId(Long id) {
		this.inventaireId = id;
	}

	public Date getDateInventaire() {
		return dateInventaire;
	}

	public void setDateInventaire(Date dateInventaire) {
		this.dateInventaire = dateInventaire;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeInventaire == null) ? 0 : codeInventaire.hashCode());
		result = prime * result + ((inventaireId == null) ? 0 : inventaireId.hashCode());
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
		InventaireModel other = (InventaireModel) obj;
		if (codeInventaire == null) {
			if (other.codeInventaire != null)
				return false;
		} else if (!codeInventaire.equals(other.codeInventaire))
			return false;
		if (inventaireId == null) {
			if (other.inventaireId != null)
				return false;
		} else if (!inventaireId.equals(other.inventaireId))
			return false;
		return true;
	}

	public InventaireModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public InventaireModel(Inventaire i) {
		setCodeInventaire(i.getCodeInventaire());
		setDateDeCreation(i.getDateDeCreation());
		setDerniereMiseAJour(i.getDerniereMiseAJour());
		setDateInventaire(i.getDateInventaire());
		setDocumentModels(getDocuments(i));
		setInventaireClos(i.isInventaireClos());
		setInventaireId(i.getInventaireId());
		setLigneInventaireModels(getLigneInventaires(i));
		setMagasinId((i.getMagasin()==null)?null:i.getMagasin().getMagasinId());
		setMagasinierEntrantId((i.getMagasinierEntrant()==null)?null:i.getMagasinierEntrant().getPartenaireId());
		setMagasinierSortantId((i.getMagasinierSortant()==null)?null:i.getMagasinierSortant().getPartenaireId());
		setNote(i.getNote());
	}

	private Collection<DocumentModel> getDocuments(Inventaire i) {
		Collection<DocumentModel> dis = new HashSet<>();
		i.getDocuments().stream().forEach(d -> {
			dis.add(new DocumentModel(d));
		});
		return dis;
	}

	private Collection<LigneInventaireModel> getLigneInventaires(Inventaire i) {
		Collection<LigneInventaireModel> lis = new HashSet<>();
		i.getLigneInventaires().stream().forEach(l -> {
			lis.add(new LigneInventaireModel(l));
		});
		return lis;
	}

}
