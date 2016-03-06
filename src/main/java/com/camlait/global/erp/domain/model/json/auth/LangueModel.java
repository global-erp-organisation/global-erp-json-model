package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;

import com.camlait.global.erp.domain.Entite;
import com.camlait.global.erp.domain.auth.Langue;
import com.camlait.global.erp.domain.auth.TermeLangue;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class LangueModel extends Entite {
	private Long langId;

	private String key;

	private String title;

	private String alt;

	private Collection<TermeLangue> termeLangues;

	
	public LangueModel(Langue l) {
		setAlt(l.getAlt());
		setKey(l.getCodeLangue());
		setLangId(l.getLangId());
		setTermeLangues(l.getTermeLangues());
		setTitle(l.getTitle());
	}
}
