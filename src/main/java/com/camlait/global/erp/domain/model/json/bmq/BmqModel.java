package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.bmq.Bmq;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.DocumentModel;
import com.camlait.global.erp.domain.model.json.operation.RecouvrementModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class BmqModel extends Entite {

	private Long bmqId;

	private String codeBmq;

	private Date dateBmq;
	private Long vendeurId;

	private Long magasinId;

	@JsonManagedReference
	private Collection<DocumentModel> documentModels;

	@JsonManagedReference
	private Collection<RecouvrementModel> recouvrementModels;

	@JsonManagedReference
	private Collection<LigneBmqModel> ligneBmqModels;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private boolean bmqClos;

	private Long responsableId;

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

	public Long getVendeurId() {
		return vendeurId;
	}

	public void setVendeurId(Long vendeurId) {
		this.vendeurId = vendeurId;
	}

	public Long getMagasinId() {
		return magasinId;
	}

	public void setMagasinId(Long magasinId) {
		this.magasinId = magasinId;
	}

	public Collection<DocumentModel> getDocumentModels() {
		return documentModels;
	}

	public void setDocumentModels(Collection<DocumentModel> documentModels) {
		this.documentModels = documentModels;
	}

	public Collection<RecouvrementModel> getRecouvrementModels() {
		return recouvrementModels;
	}

	public void setRecouvrementModels(Collection<RecouvrementModel> recouvrementModels) {
		this.recouvrementModels = recouvrementModels;
	}

	public Collection<LigneBmqModel> getLigneBmqModels() {
		return ligneBmqModels;
	}

	public void setLigneBmqModels(Collection<LigneBmqModel> ligneBmqModels) {
		this.ligneBmqModels = ligneBmqModels;
	}

	public boolean isBmqClos() {
		return bmqClos;
	}

	public void setBmqClos(boolean bmqClos) {
		this.bmqClos = bmqClos;
	}

	public Long getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(Long responsableId) {
		this.responsableId = responsableId;
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
		BmqModel other = (BmqModel) obj;
		if (bmqId == null) {
			if (other.bmqId != null)
				return false;
		} else if (!bmqId.equals(other.bmqId))
			return false;
		return true;
	}

	public BmqModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public BmqModel(Bmq b) {
		setBmqClos(b.isBmqClos());
		setBmqId(b.getBmqId());
		setCodeBmq(b.getCodeBmq());
		setDateBmq(b.getDateBmq());
		setDateDeCreation(b.getDateDeCreation());
		setDerniereMiseAJour(b.getDerniereMiseAJour());
		setDocumentModels(getDocument(b));
		setLigneBmqModels(getLigneBmq(b));
		setMagasinId((b.getMagasin() == null) ? null : b.getMagasin().getMagasinId());
		setRecouvrementModels(getRecouvrement(b));
		setResponsableId((b.getResponsable() == null) ? null : b.getResponsable().getPartenaireId());
		setVendeurId((b.getVendeur() == null) ? null : b.getVendeur().getPartenaireId());
	}

	private Collection<DocumentModel> getDocument(Bmq b) {
		Collection<DocumentModel> docs = new HashSet<>();
		b.getDocuments().stream().forEach(d -> {
			docs.add(new DocumentModel(d));
		});
		return docs;
	}

	private Collection<RecouvrementModel> getRecouvrement(Bmq b) {
		Collection<RecouvrementModel> recs = new HashSet<>();
		b.getRecouvrements().stream().forEach(r -> {
			recs.add(new RecouvrementModel(r));
		});
		return recs;
	}

	private Collection<LigneBmqModel> getLigneBmq(Bmq b) {
		Collection<LigneBmqModel> lignes = new HashSet<>();
		b.getLigneBmqs().stream().forEach(l -> {
			lignes.add(new LigneBmqModel(l));
		});
		return lignes;
	}
}
