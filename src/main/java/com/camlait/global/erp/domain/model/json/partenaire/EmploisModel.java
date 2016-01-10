package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.HashSet;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.partenaire.Emplois;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class EmploisModel extends Entite {

	private Long emploisId;

	private String codeEmplois;
	private String descriptionEmplois;

	@JsonManagedReference
	private Collection<EmployeModel> employeModels;

	public Long getEmploisId() {
		return emploisId;
	}

	public void setEmploisId(Long emploisId) {
		this.emploisId = emploisId;
	}

	public String getCodeEmplois() {
		return codeEmplois;
	}

	public void setCodeEmplois(String codeEmplois) {
		this.codeEmplois = codeEmplois;
	}

	public String getDescriptionEmplois() {
		return descriptionEmplois;
	}

	public void setDescriptionEmplois(String descriptionEmplois) {
		this.descriptionEmplois = descriptionEmplois;
	}

	public Collection<EmployeModel> getEmployes() {
		return employeModels;
	}

	public void setEmployes(Collection<EmployeModel> employeModels) {
		this.employeModels = employeModels;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emploisId == null) ? 0 : emploisId.hashCode());
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
		EmploisModel other = (EmploisModel) obj;
		if (emploisId == null) {
			if (other.emploisId != null)
				return false;
		} else if (!emploisId.equals(other.emploisId))
			return false;
		return true;
	}

	public EmploisModel() {
		super();
	}

	public EmploisModel(Emplois e) {
		setCodeEmplois(e.getCodeEmplois());
		setDescriptionEmplois(e.getDescriptionEmplois());
		setEmploisId(e.getEmploisId());
		setEmployes(getEmployes(e));
	}

	private Collection<EmployeModel> getEmployes(Emplois e) {
		Collection<EmployeModel> ems = new HashSet<>();
		e.getEmployes().stream().forEach(em -> {
			ems.add(new EmployeModel(em));
		});
		return ems;
	}

}
