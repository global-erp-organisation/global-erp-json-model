package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.auth.Utilisateur;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.partenaire.EmployeModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class UtilisateurModel extends Entite {

	private String codeUtilisateur;

	private String courriel;

	private String motDePasse;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	@JsonManagedReference
	private Collection<EmployeModel> employeModels;

	public String getCodeUtilisateur() {
		return codeUtilisateur;
	}

	public void setCodeUtilisateur(String codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
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
		result = prime * result + ((codeUtilisateur == null) ? 0 : codeUtilisateur.hashCode());
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
		UtilisateurModel other = (UtilisateurModel) obj;
		if (codeUtilisateur == null) {
			if (other.codeUtilisateur != null)
				return false;
		} else if (!codeUtilisateur.equals(other.codeUtilisateur))
			return false;
		return true;
	}

	public UtilisateurModel() {
		setDateDeCreation(new Date());
		setDerniereMiseAJour(new Date());
	}

	public UtilisateurModel(Utilisateur u) {
		setCodeUtilisateur(u.getCodeUtilisateur());
		setCodeUtilisateur(u.getCourriel());
		setDateDeCreation(u.getDateDeCreation());
		setDerniereMiseAJour(u.getDerniereMiseAJour());
		setEmployes(getEmployes(u));
		setMotDePasse(u.getMotDePasse());
	}

	private Collection<EmployeModel> getEmployes(Utilisateur u) {
		Collection<EmployeModel> emps = new HashSet<>();
		u.getEmployes().stream().forEach(e -> {
			emps.add(new EmployeModel(e));
		});
		return emps;
	}
}
