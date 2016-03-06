package com.camlait.global.erp.domain.model.json.immobilisation;

import java.util.Date;

import com.camlait.global.erp.domain.immobilisation.Immobilisation;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ImmobilisationModel extends Entite {

	private Long immoId;

	private String codeImmo;

	private Date dateAcquisition;

	private Date dateMiseEnService;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private String descriptionImmo;

	public ImmobilisationModel(Immobilisation i) {
		setCodeImmo(i.getCodeImmo());
		setDateAcquisition(i.getDateAcquisition());
		setDateDeCreation(i.getDateDeCreation());
		setDerniereMiseAJour(i.getDerniereMiseAJour());
		setDateMiseEnService(i.getDateMiseEnService());
		setDescriptionImmo(i.getDescriptionImmo());
		setImmoId(i.getImmoId());
	}

}
