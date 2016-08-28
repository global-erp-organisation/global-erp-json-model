package com.camlait.global.erp.domain.model.json.organisation;

import java.util.Collection;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVenteModel;
import com.camlait.global.erp.domain.model.json.partenaire.ClientModel;
import com.camlait.global.erp.domain.organisation.Zone;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ZoneModel extends LocalisationModel {

    private Long secteurId;

    @JsonManagedReference
    private Collection<DocumentDeVenteModel> documents;

    @JsonManagedReference
    private Collection<ClientModel> clientModels;

    public ZoneModel(Zone z) {
        super(z);
        setClientModels(gestClients(z));
        setDocuments(getDocuments(z));
        setSecteurId((z.getSecteur() == null) ? null : z.getSecteur().getLocalId());
    }

    private Collection<DocumentDeVenteModel> getDocuments(Zone z) {
        return z.getDocuments().stream().map(d -> {
            return new DocumentDeVenteModel(d);
        }).collect(Collectors.toList());
    }

    private Collection<ClientModel> gestClients(Zone z) {
        return z.getClients().stream().map(c -> {
            return new ClientModel(c);
        }).collect(Collectors.toList());
    }
}
