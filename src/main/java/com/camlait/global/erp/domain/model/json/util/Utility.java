package com.camlait.global.erp.domain.model.json.util;

import com.camlait.global.erp.domain.model.json.Entite;
import com.camlait.global.erp.domain.model.json.bmq.Bmq;
import com.camlait.global.erp.domain.model.json.document.Document;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.DocumentDeVente;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.FactureClient;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.FactureClientComptant;
import com.camlait.global.erp.domain.model.json.document.commerciaux.vente.FactureMarge;
import com.camlait.global.erp.domain.model.json.document.stock.entree.BonDeRetour;
import com.camlait.global.erp.domain.model.json.document.stock.entree.BonEntree;
import com.camlait.global.erp.domain.model.json.document.stock.entree.DocumentEntree;
import com.camlait.global.erp.domain.model.json.document.stock.sortie.Animation;
import com.camlait.global.erp.domain.model.json.document.stock.sortie.Avarie;
import com.camlait.global.erp.domain.model.json.document.stock.sortie.BonDeSortie;
import com.camlait.global.erp.domain.model.json.document.stock.sortie.DocumentDeSortie;
import com.camlait.global.erp.domain.model.json.document.stock.sortie.Don;
import com.camlait.global.erp.domain.model.json.document.stock.sortie.Echantillon;
import com.camlait.global.erp.domain.model.json.entrepot.Entrepot;
import com.camlait.global.erp.domain.model.json.entrepot.Magasin;
import com.camlait.global.erp.domain.model.json.entrepot.MagasinMobile;
import com.camlait.global.erp.domain.model.json.enumeration.AutreEnum;
import com.camlait.global.erp.domain.model.json.enumeration.EnumTypeEntite;
import com.camlait.global.erp.domain.model.json.enumeration.Portee;
import com.camlait.global.erp.domain.model.json.enumeration.TypeDocuments;
import com.camlait.global.erp.domain.model.json.enumeration.TypePartenaire;
import com.camlait.global.erp.domain.model.json.inventaire.Inventaire;
import com.camlait.global.erp.domain.model.json.organisation.Centre;
import com.camlait.global.erp.domain.model.json.organisation.Localisation;
import com.camlait.global.erp.domain.model.json.organisation.Region;
import com.camlait.global.erp.domain.model.json.organisation.Secteur;
import com.camlait.global.erp.domain.model.json.partenaire.Caissier;
import com.camlait.global.erp.domain.model.json.partenaire.Client;
import com.camlait.global.erp.domain.model.json.partenaire.ClientAmarge;
import com.camlait.global.erp.domain.model.json.partenaire.ClientComptant;
import com.camlait.global.erp.domain.model.json.partenaire.Employe;
import com.camlait.global.erp.domain.model.json.partenaire.Magasinier;
import com.camlait.global.erp.domain.model.json.partenaire.Partenaire;
import com.camlait.global.erp.domain.model.json.partenaire.Vendeur;
import com.camlait.global.erp.domain.model.json.produit.CategorieProduit;

public final class Utility {
    
    public static boolean isFactureClient(Document document) {
        return document instanceof FactureClient;
    }
    
    public static boolean isFactureComptant(Document document) {
        return document instanceof FactureClientComptant;
    }
    
    public static boolean isFactureMarge(Document document) {
        return document instanceof FactureMarge;
    }
    
    public static boolean isDocumentDeVente(Document document) {
        return document instanceof DocumentDeVente;
    }
    
    public static boolean isDetail(CategorieProduit categorie) {
        return categorie.getPortee() == Portee.DETAIL;
    }
    
    public static boolean isTotal(CategorieProduit categorie) {
        return categorie.getPortee() == Portee.TOTAL;
    }
    
    public static EnumTypeEntite obtenirPrefixe(Entite entite) throws IllegalArgumentException {
        if (entite instanceof Bmq)
            return AutreEnum.BMQ;
        else if (entite instanceof Document)
            return obtenirPrefixeDocument(entite);
        else if (entite instanceof Partenaire)
            return obtenirPrefixePartenaire(entite);
        else if (entite instanceof Localisation)
            return obtenirPrefixeLocalisation(entite);
        else if (entite instanceof Inventaire)
            return AutreEnum.INVENTAIRE;
        else if (entite instanceof Magasin) {
            if (entite instanceof MagasinMobile) {
                return AutreEnum.MAGASIN_MOBILE;
            } else
                return AutreEnum.MAGASIN_FIXE;
        } else if (entite instanceof Entrepot) {
            return AutreEnum.ENTREPOT;
        } else
            throw new IllegalArgumentException("L'entit� " + entite.getClass().getName() + " n'existe pas");
    }
    
    public static Long convertToLong(String num) {
        try {
            return Long.parseLong(num);
        } catch (Exception e) {
            throw e;
        }
    }
    
    private static EnumTypeEntite obtenirPrefixeDocument(Entite entite) {
        if (entite instanceof Document) {
            if (entite instanceof DocumentDeVente) {
                if (entite instanceof FactureClient) {
                    if (entite instanceof FactureClientComptant)
                        return TypeDocuments.FACTURE_COMPTANT;
                    else if (entite instanceof FactureMarge)
                        return TypeDocuments.FACTURE_MARGE;
                    else
                        return TypeDocuments.FACTURE_CLIENT;
                } else
                    return TypeDocuments.DOCUMENT_DE_VENTE;
            } else if (entite instanceof DocumentDeSortie) {
                if (entite instanceof BonDeSortie)
                    return TypeDocuments.BON_DE_SORTIE;
                if (entite instanceof Echantillon)
                    return TypeDocuments.ECHANTILLON;
                if (entite instanceof Don)
                    return TypeDocuments.DON;
                if (entite instanceof Avarie)
                    return TypeDocuments.AVARIE;
                if (entite instanceof Animation)
                    return TypeDocuments.ANIMATION;
                else
                    return TypeDocuments.DOCUMENT_SORTIE;
            } else if (entite instanceof DocumentEntree) {
                if (entite instanceof BonEntree)
                    return TypeDocuments.BON_ENTREE;
                else if (entite instanceof BonDeRetour)
                    return TypeDocuments.BON_DE_RETOUR;
                else
                    return TypeDocuments.DOCUMENT_ENTREE;
            }
        }
        throw new IllegalArgumentException("L'entit� " + entite.getClass().getName() + " n'existe pas");
    }
    
    private static EnumTypeEntite obtenirPrefixePartenaire(Entite entite) {
        if (entite instanceof Partenaire) {
            if (entite instanceof Employe) {
                if (entite instanceof Magasinier)
                    return TypePartenaire.MAGASINIER;
                else if (entite instanceof Vendeur)
                    return TypePartenaire.VENDEUR;
                else if (entite instanceof Caissier)
                    return TypePartenaire.CAISSIER;
                else
                    return TypePartenaire.EMPLOYE;
            } else if (entite instanceof Client) {
                if (entite instanceof ClientAmarge)
                    return TypePartenaire.CLIENT_A_MARGE;
                else if (entite instanceof ClientComptant)
                    return TypePartenaire.CLIENT_COMPTANT;
                else
                    return TypePartenaire.CLIENT;
            }
        }
        throw new IllegalArgumentException("L'entit� " + entite.getClass().getName() + " n'existe pas");
    }
    
    private static EnumTypeEntite obtenirPrefixeLocalisation(Entite entite) {
        if (entite instanceof Localisation) {
            if (entite instanceof Centre) {
                return AutreEnum.CENTRE;
            } else if (entite instanceof Region) {
                return AutreEnum.REGION;
            } else if (entite instanceof Secteur) {
                return AutreEnum.SECTEUR;
            } else
                return AutreEnum.ZONE;
        }
        throw new IllegalArgumentException("L'entit� " + entite.getClass().getName() + " n'existe pas");
    }
}
