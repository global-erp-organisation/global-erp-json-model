package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.partenaire.Emplois;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class EmploisModel extends Entite {

	private Long emploisId;

	private String codeEmplois;
	private String descriptionEmplois;

	@JsonManagedReference
	private Collection<EmployeModel> employeModels;


	public EmploisModel(Emplois e) {
		setCodeEmplois(e.getCodeEmplois());
		setDescriptionEmplois(e.getDescriptionEmplois());
		setEmploisId(e.getEmploisId());
		setEmployeModels(getEmployes(e));
	}

	private Collection<EmployeModel> getEmployes(Emplois e) {
		Collection<EmployeModel> ems = new HashSet<>();
		e.getEmployes().stream().forEach(em -> {
			ems.add(new EmployeModel(em));
		});
		return ems;
	}

}
