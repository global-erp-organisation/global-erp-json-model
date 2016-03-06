package com.camlait.global.erp.domain.model.json.entrepot;

import java.util.Date;

import com.camlait.global.erp.domain.entrepot.Magasin;
import com.camlait.global.erp.domain.enumeration.AutreEnum;
import com.camlait.global.erp.domain.model.json.Entite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class MagasinModel extends Entite {
	private Long magasinId;

	private String codeMagasin;

	private String descriptionMagasin;

	private Long entrepotId;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private AutreEnum typeMagasin;

	
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
