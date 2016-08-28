package com.camlait.global.erp.domain.model.json.operation.caisse;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.operation.caisse.JournalCaisse;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class JournalCaisseModel extends Entite {

    private Long journalId;

    private String codeJournal;

    private String description;

    private Date dateDebutJournal;

    private Date dateFinJournal;

    private Long caisseId;

    @JsonManagedReference
    private Collection<OperationDeCaisseModel> operations;

    private Date dateDeCreation;

    private Date derniereMiseAJour;

    public JournalCaisseModel(JournalCaisse j) {
        setCaisseId((j.getCaisse() == null) ? null : j.getCaisse().getCaisseId());
        setCodeJournal(j.getCodeJournal());
        setDateDebutJournal(j.getDateDebutJournal());
        setDateFinJournal(j.getDateFinJournal());
        setDerniereMiseAJour(j.getDerniereMiseAJour());
        setDescription(j.getDescription());
        setJournalId(j.getJournalId());
        setOperations(getOperations(j));
    }

    private Collection<OperationDeCaisseModel> getOperations(JournalCaisse j) {
        return j.getOpreations().stream().map(o -> {
            return new OperationDeCaisseModel(o);
        }).collect(Collectors.toList());
    }
}
