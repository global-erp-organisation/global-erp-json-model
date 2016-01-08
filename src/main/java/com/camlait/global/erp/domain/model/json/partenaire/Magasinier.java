package com.camlait.global.erp.domain.model.json.partenaire;

import java.util.Collection;

import com.camlait.global.erp.domain.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.inventaire.Inventaire;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Magasinier extends Employe {

	
    private Collection<Inventaire> inventaires;

    public Collection<Inventaire> getInventaires() {
        return inventaires;
    }

    public void setInventaires(Collection<Inventaire> inventaires) {
        this.inventaires = inventaires;
    }

    public Magasinier() {
    	setTypePartenaire(TypePartenaire.MAGASINIER);
    }

}
