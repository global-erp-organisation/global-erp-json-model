package com.camlait.global.erp.domain.model.json.immobilisation;

import java.util.Date;

import com.camlait.global.erp.domain.immobilisation.PartenaireImmobilisation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class PartenaireImmobilisationModel {

	private Long partenaireImmoId;

	private Long partenaireId;

	private Long immoId;

	private Date dateAllocation;

	private boolean actif;

	private Date dateDeCreation;
	private Date derniereMiseAJour;

	public PartenaireImmobilisationModel(PartenaireImmobilisation i) {
		setActif(i.isActif());
		setPartenaireImmoId(i.getClientImmoId());
		setDateDeCreation(i.getDateDeCreation());
		setDateAllocation(i.getDateAllocation());
		setDerniereMiseAJour(i.getDerniereMiseAJour());
		setImmoId((i.getImmobilisation() == null) ? null : i.getImmobilisation().getImmoId());
		setPartenaireId((i.getPartenaire() == null) ? null : i.getPartenaire().getPartenaireId());
	}
}
