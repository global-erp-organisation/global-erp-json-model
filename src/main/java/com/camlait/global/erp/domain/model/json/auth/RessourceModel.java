package com.camlait.global.erp.domain.model.json.auth;

import com.camlait.global.erp.domain.model.json.Entite;

public class RessourceModel extends Entite {
    
    private Long ressourceId;
    private String codeRessource;
    
    private Long ressourceParentId;
    
    private String descriptionRessource;
    
    public Long getRessourceId() {
        return ressourceId;
    }
    
    public void setRessourceId(Long meduId) {
        this.ressourceId = meduId;
    }
    
    public String getCodeRessource() {
        return codeRessource;
    }
    
    public void setCodeRessource(String codeMenu) {
        this.codeRessource = codeMenu;
    }
    
    public Long getRessourceParentId() {
        return ressourceParentId;
    }
    
    public void setRessourceParentId(Long ressourceParentId) {
        this.ressourceParentId = ressourceParentId;
    }
    
    public String getDescriptionRessource() {
        return descriptionRessource;
    }
    
    public void setDescriptionRessource(String descriptionMenu) {
        this.descriptionRessource = descriptionMenu;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ressourceId == null) ? 0 : ressourceId.hashCode());
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
        RessourceModel other = (RessourceModel) obj;
        if (ressourceId == null) {
            if (other.ressourceId != null)
                return false;
        } else if (!ressourceId.equals(other.ressourceId))
            return false;
        return true;
    }
    
    public RessourceModel(String codeMenu, String descriptionMenu) {
        super();
        this.codeRessource = codeMenu;
        this.descriptionRessource = descriptionMenu;
    }
    
    public RessourceModel(String codeMenu, String descriptionMenu, Long menuParentId) {
        super();
        this.codeRessource = codeMenu;
        this.descriptionRessource = descriptionMenu;
        this.ressourceParentId = menuParentId;
    }
}
