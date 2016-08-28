package com.camlait.global.erp.domain.model.json.entrepot;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.entrepot.Entrepot;
import com.camlait.global.erp.domain.model.json.Entite;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class EntrepotModel extends Entite {

    private Long entrepotId;

    private String codeEntrepot;

    private String descriptionEntrepot;

    private Long centreId;

    private Date dateDeCreation;

    private Date derniereMiseAJour;

    private Long responsableId;

    @JsonManagedReference
    private Collection<MagasinModel> magasinModels;

    public EntrepotModel(Entrepot e) {
        setCodeEntrepot(e.getCodeEntrepot());
        setDateDeCreation(e.getDateDeCreation());
        setDerniereMiseAJour(e.getDerniereMiseAJour());
        setDescriptionEntrepot(e.getDescriptionEntrepot());
        setEntrepotId(e.getEntrepotId());
        setMagasinModels(getMagasins(e));
        setResponsableId((e.getResponsable() == null) ? null : e.getResponsable().getPartenaireId());
        setCentreId((e.getCentre() == null) ? null : e.getCentre().getLocalId());
    }

    private Collection<MagasinModel> getMagasins(Entrepot e) {
        return e.getMagasins().stream().map(m -> {
            return new MagasinModel(m);
        }).collect(Collectors.toList());
    }
}
