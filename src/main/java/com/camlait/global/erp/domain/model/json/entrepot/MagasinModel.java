package com.camlait.global.erp.domain.model.json.entrepot;

import java.util.Date;

import com.camlait.global.erp.domain.entrepot.Magasin;
import com.camlait.global.erp.domain.enumeration.AutreEnum;
import com.camlait.global.erp.domain.model.json.Entite;

public class MagasinModel extends Entite {
	private Long magasinId;

	private String codeMagasin;

	private String descriptionMagasin;

	private Long entrepotId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private AutreEnum typeMagasin;

	public String getCodeMagasin() {
		return codeMagasin;
	}

	public void setCodeMagasin(String codeMagasin) {
		this.codeMagasin = codeMagasin;
	}

	public String getDescriptionMagasin() {
		return descriptionMagasin;
	}

	public void setDescriptionMagasin(String descriptionMagasin) {
		this.descriptionMagasin = descriptionMagasin;
	}

	public Long getEntrepotId() {
		return entrepotId;
	}

	public void setEntrepotId(Long entrepotId) {
		this.entrepotId = entrepotId;
	}

	public Long getMagasinId() {
		return magasinId;
	}

	public void setMagasinId(Long magasinId) {
		this.magasinId = magasinId;
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

	public AutreEnum getTypeMagasin() {
		return typeMagasin;
	}

	public void setTypeMagasin(AutreEnum typeMagasin) {
		this.typeMagasin = typeMagasin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeMagasin == null) ? 0 : codeMagasin.hashCode());
		result = prime * result + ((magasinId == null) ? 0 : magasinId.hashCode());
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
		MagasinModel other = (MagasinModel) obj;
		if (codeMagasin == null) {
			if (other.codeMagasin != null)
				return false;
		} else if (!codeMagasin.equals(other.codeMagasin))
			return false;
		if (magasinId == null) {
			if (other.magasinId != null)
				return false;
		} else if (!magasinId.equals(other.magasinId))
			return false;
		return true;
	}

	public MagasinModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}
	
	public MagasinModel(Magasin m) {
		setCodeMagasin(m.getCodeMagasin());
		setDateDeCreation(m.getDateDeCreation());
		setDerniereMiseAJour(m.getDerniereMiseAJour());
		setDescriptionMagasin(m.getDescriptionMagasin());
		setEntrepotId((m.getEntrepot()==null)?null:m.getEntrepot().getEntrepotId());
		setMagasinId(m.getMagasinId());
		setTypeMagasin(m.getTypeMagasin());
	}

}
