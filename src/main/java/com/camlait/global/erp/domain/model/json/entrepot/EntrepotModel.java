package com.camlait.global.erp.domain.model.json.entrepot;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.entrepot.Entrepot;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class EntrepotModel extends Entite {

	private Long entrepotId;

	private String codeEntrepot;

	private String descriptionEntrepot;

	private Long centreId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private Long responsableId;

	@JsonManagedReference
	private Collection<MagasinModel> magasinModels;

	public Long getEntrepotId() {
		return entrepotId;
	}

	public void setEntrepotId(Long entrepotId) {
		this.entrepotId = entrepotId;
	}

	public String getCodeEntrepot() {
		return codeEntrepot;
	}

	public void setCodeEntrepot(String codeEntrepot) {
		this.codeEntrepot = codeEntrepot;
	}

	public String getDescriptionEntrepot() {
		return descriptionEntrepot;
	}

	public void setDescriptionEntrepot(String descriptionEntrepot) {
		this.descriptionEntrepot = descriptionEntrepot;
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

	public Long getCentreId() {
		return centreId;
	}

	public void setCentreId(Long centreId) {
		this.centreId = centreId;
	}

	public Long getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(Long responsableId) {
		this.responsableId = responsableId;
	}

	public Collection<MagasinModel> getMagasinModels() {
		return magasinModels;
	}

	public void setMagasinModels(Collection<MagasinModel> magasinModels) {
		this.magasinModels = magasinModels;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeEntrepot == null) ? 0 : codeEntrepot.hashCode());
		result = prime * result + ((entrepotId == null) ? 0 : entrepotId.hashCode());
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
		EntrepotModel other = (EntrepotModel) obj;
		if (codeEntrepot == null) {
			if (other.codeEntrepot != null)
				return false;
		} else if (!codeEntrepot.equals(other.codeEntrepot))
			return false;
		if (entrepotId == null) {
			if (other.entrepotId != null)
				return false;
		} else if (!entrepotId.equals(other.entrepotId))
			return false;
		return true;
	}

	public EntrepotModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public EntrepotModel(Entrepot e) {
		setCodeEntrepot(e.getCodeEntrepot());
		setDateDeCreation(e.getDateDeCreation());
		setDerniereMiseAJour(e.getDerniereMiseAJour());
		setDescriptionEntrepot(e.getDescriptionEntrepot());
		setEntrepotId(e.getEntrepotId());
		setMagasinModels(getMagasins(e));
		setResponsableId((e.getResponsable()==null)?null:e.getResponsable().getPartenaireId());
		setCentreId((e.getCentre()==null)?null:e.getCentre().getLocalId());
	}

	private Collection<MagasinModel> getMagasins(Entrepot e) {
		Collection<MagasinModel> mgs = new HashSet<>();
		e.getMagasins().stream().forEach(m -> {
			mgs.add(new MagasinModel(m));
		});
		return mgs;
	}
}
