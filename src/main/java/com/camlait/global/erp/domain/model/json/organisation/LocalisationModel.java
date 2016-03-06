package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Date;

import com.camlait.global.erp.domain.enumeration.AutreEnum;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.organisation.Localisation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class LocalisationModel extends Entite {

	private Long localId;

	private String code;

	private String descriptionLocal;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private AutreEnum typeLocal;

	public LocalisationModel(Localisation l) {
		setTypeLocal(l.getTypeLocal());
		setCode(l.getCode());
		setDateDeCreation(l.getDateDeCreation());
		setDerniereMiseAJour(l.getDerniereMiseAJour());
		setDescriptionLocal(l.getDescriptionLocal());
		setLocalId(l.getLocalId());
	}
}
