package com.camlait.global.erp.domain.model.json.operation.caisse;

import java.util.Date;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.caisse.Caisse;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class CaisseModel extends Entite {
	private Long caisseId;

	private String codeCaisse;

	private String descriptionCaisse;

	private Long responsableId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	public CaisseModel(Caisse c) {
		setCaisseId(c.getCaisseId());
		setCodeCaisse(c.getCodeCaisse());
		setDateDeCreation(c.getDateDeCreation());
		setDerniereMiseAJour(c.getDerniereMiseAJour());
		setDescriptionCaisse(c.getDescriptionCaisse());
		setResponsableId((c.getResponsable()==null)?null:c.getResponsable().getPartenaireId());
	}

}
