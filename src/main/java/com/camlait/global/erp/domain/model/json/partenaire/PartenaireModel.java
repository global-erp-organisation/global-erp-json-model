package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVenteModel;
import com.camlait.global.erp.domain.model.json.immobilisation.PartenaireImmobilisationModel;
import com.camlait.global.erp.domain.model.json.operation.OperationModel;
import com.camlait.global.erp.domain.partenaire.Partenaire;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public abstract class PartenaireModel extends Entite {

	private Long partenaireId;

	private String codePartenaire;

	private String adresse;

	private String telephone;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private TypePartenaire typePartenaire;

	private Long centreId;

	@JsonManagedReference
	private Collection<DocumentDeVenteModel> documents;

	@JsonManagedReference
	private Collection<PartenaireImmobilisationModel> partenaireImmobilisationModels;

	@JsonManagedReference
	private Collection<OperationModel> operationModels;

	public Long getPartenaireId() {
		return partenaireId;
	}

	public void setPartenaireId(Long partenaireId) {
		this.partenaireId = partenaireId;
	}

	public String getCodePartenaire() {
		return codePartenaire;
	}

	public void setCodePartenaire(String codePartenaire) {
		this.codePartenaire = codePartenaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public Collection<DocumentDeVenteModel> getDocuments() {
		return documents;
	}

	public void setDocuments(Collection<DocumentDeVenteModel> documents) {
		this.documents = documents;
	}

	public Collection<PartenaireImmobilisationModel> getPartenaireImmobilisations() {
		return partenaireImmobilisationModels;
	}

	public void setPartenaireImmobilisations(Collection<PartenaireImmobilisationModel> partenaireImmobilisationModels) {
		this.partenaireImmobilisationModels = partenaireImmobilisationModels;
	}

	public Collection<OperationModel> getOperations() {
		return operationModels;
	}

	public void setOperations(Collection<OperationModel> operationModels) {
		this.operationModels = operationModels;
	}

	public TypePartenaire getTypePartenaire() {
		return typePartenaire;
	}

	public void setTypePartenaire(TypePartenaire typePartenaire) {
		this.typePartenaire = typePartenaire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePartenaire == null) ? 0 : codePartenaire.hashCode());
		result = prime * result + ((partenaireId == null) ? 0 : partenaireId.hashCode());
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
		PartenaireModel other = (PartenaireModel) obj;
		if (codePartenaire == null) {
			if (other.codePartenaire != null)
				return false;
		} else if (!codePartenaire.equals(other.codePartenaire))
			return false;
		if (partenaireId == null) {
			if (other.partenaireId != null)
				return false;
		} else if (!partenaireId.equals(other.partenaireId))
			return false;
		return true;
	}

	public PartenaireModel() {
	}

	public PartenaireModel(Partenaire p) {
		setAdresse(p.getAdresse());
		setCentreId((p.getCentre() == null) ? null : p.getCentre().getLocalId());
		setCodePartenaire(p.getCodePartenaire());
		setDateDeCreation(p.getDateDeCreation());
		setDerniereMiseAJour(p.getDerniereMiseAJour());
		setDocuments(getDocuments(p));
		setTypePartenaire(p.getTypePartenaire());
		setTelephone(p.getTelephone());
		setOperations(getOperations(p));
		setPartenaireId(p.getPartenaireId());
		setPartenaireImmobilisations(getImmos(p));
	}

	private Collection<DocumentDeVenteModel> getDocuments(Partenaire p) {
		Collection<DocumentDeVenteModel> ds = new HashSet<>();
		p.getDocuments().stream().forEach(d -> {
			ds.add(new DocumentDeVenteModel(d));
		});
		return ds;
	}

	private Collection<OperationModel> getOperations(Partenaire p) {
		Collection<OperationModel> ops = new HashSet<>();
		p.getOperations().stream().forEach(o -> {
			ops.add(new OperationModel(o));
		});
		return ops;
	}

	private Collection<PartenaireImmobilisationModel> getImmos(Partenaire p) {
		Collection<PartenaireImmobilisationModel> pi = new HashSet<>();
		p.getPartenaireImmobilisations().stream().forEach(i -> {
			pi.add(new PartenaireImmobilisationModel(i));
		});
		return pi;
	}
}
