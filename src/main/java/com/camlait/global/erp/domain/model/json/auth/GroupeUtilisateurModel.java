package com.camlait.global.erp.domain.model.json.auth;

import com.camlait.global.erp.domain.model.json.Entite;

public class GroupeUtilisateurModel extends Entite {
    
    private Long groupeUtilissateurId;
    private Long groupeId;
    
    private Long utilsateurId;
    
    public Long getGroupeUtilissateurId() {
        return groupeUtilissateurId;
    }
    
    public void setGroupeUtilissateurId(Long groupeUtilissateurId) {
        this.groupeUtilissateurId = groupeUtilissateurId;
    }
    
    public Long getGroupeId() {
        return groupeId;
    }
    
    public void setGroupeId(Long groupeId) {
        this.groupeId = groupeId;
    }
    
    public Long getUtilsateurId() {
        return utilsateurId;
    }
    
    public void setUtilsateurId(Long utilsateurId) {
        this.utilsateurId = utilsateurId;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((groupeUtilissateurId == null) ? 0 : groupeUtilissateurId.hashCode());
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
        GroupeUtilisateurModel other = (GroupeUtilisateurModel) obj;
        if (groupeUtilissateurId == null) {
            if (other.groupeUtilissateurId != null)
                return false;
        } else if (!groupeUtilissateurId.equals(other.groupeUtilissateurId))
            return false;
        return true;
    }
    
    public GroupeUtilisateurModel() {
        super();
    }
}
