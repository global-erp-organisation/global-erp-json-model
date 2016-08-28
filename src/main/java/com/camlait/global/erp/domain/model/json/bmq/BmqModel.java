package com.camlait.global.erp.domain.model.json.bmq;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.bmq.Bmq;
import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.document.DocumentModel;
import com.camlait.global.erp.domain.model.json.operation.RecouvrementModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class BmqModel extends Entite {

	private Long bmqId;

	private String codeBmq;

	private Date dateBmq;
	private Long vendeurId;

	private Long magasinId;

	@JsonManagedReference
	private Collection<DocumentModel> documentModels;

	@JsonManagedReference
	private Collection<RecouvrementModel> recouvrementModels;

	@JsonManagedReference
	private Collection<LigneBmqModel> ligneBmqModels;

	private Date dateDeCreation;

	private Date derniereMiseAJour;

	private boolean bmqClos;

	private Long responsableId;


	public BmqModel(Bmq b) {
		setBmqClos(b.isBmqClos());
		setBmqId(b.getBmqId());
		setCodeBmq(b.getCodeBmq());
		setDateBmq(b.getDateBmq());
		setDateDeCreation(b.getDateDeCreation());
		setDerniereMiseAJour(b.getDerniereMiseAJour());
		setDocumentModels(getDocument(b));
		setLigneBmqModels(getLigneBmq(b));
		setMagasinId((b.getMagasin() == null) ? null : b.getMagasin().getMagasinId());
		setRecouvrementModels(getRecouvrement(b));
		setResponsableId((b.getResponsable() == null) ? null : b.getResponsable().getPartenaireId());
		setVendeurId((b.getVendeur() == null) ? null : b.getVendeur().getPartenaireId());
	}

	private Collection<DocumentModel> getDocument(Bmq b) {
		Collection<DocumentModel> docs = new HashSet<>();
		b.getDocuments().stream().forEach(d -> {
			docs.add(new DocumentModel(d));
		});
		return docs;
	}

	private Collection<RecouvrementModel> getRecouvrement(Bmq b) {
		return b.getRecouvrements().stream().map(r->{
		    return new RecouvrementModel(r);
		}).collect(Collectors.toList());
	}

	private Collection<LigneBmqModel> getLigneBmq(Bmq b) {
		return b.getLigneBmqs().stream().map(l->{
		    return new LigneBmqModel(l);
		}).collect(Collectors.toList());
	}
}
