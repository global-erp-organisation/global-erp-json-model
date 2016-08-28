package com.camlait.global.erp.domain.model.json.document;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.document.Document;
import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class DocumentModel extends Entite {

    private Long documentId;

    private String codeDocument;

    private Date dateDocument;

    private Long magasinId;

    private Long responsableDocumentId;

    private Date dateDeCreation;

    private Date derniereMiseAJour;
    private SensOperation sensOperation;

    private Long bmqId;

    private Long inventaireId;

    @JsonManagedReference
    private Collection<LigneDeDocumentModel> ligneDocuments;

    private TypeDocuments typeDocument;

    public DocumentModel(Document d) {
        setBmqId((d.getBmq() == null) ? null : d.getBmq().getBmqId());
        setCodeDocument(d.getCodeDocument());
        setDateDeCreation(d.getDateDeCreation());
        setDerniereMiseAJour(d.getDerniereMiseAJour());
        setDateDocument(d.getDateDocument());
        setDocumentId(d.getDocumentId());
        setInventaireId((d.getInventaire() == null) ? null : d.getInventaire().getInventaireId());
        setLigneDocuments(getLignes(d));
        setMagasinId((d.getMagasin() == null) ? null : d.getMagasin().getMagasinId());
        setResponsableDocumentId((d.getResponsableDocument() == null) ? null : d.getResponsableDocument().getPartenaireId());
        setSensOperation(d.getSensOperation());
        setTypeDocument(d.getTypeDocument());
    }

    private Collection<LigneDeDocumentModel> getLignes(Document d) {
        return d.getLigneDocuments().stream().map(l -> {
            return new LigneDeDocumentModel(l);
        }).collect(Collectors.toList());
    }

}
