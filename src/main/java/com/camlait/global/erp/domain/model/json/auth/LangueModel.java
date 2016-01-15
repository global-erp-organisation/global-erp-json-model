package com.camlait.global.erp.domain.model.json.auth;

import java.util.Collection;

import com.camlait.global.erp.domain.Entite;
import com.camlait.global.erp.domain.auth.Langue;
import com.camlait.global.erp.domain.auth.TermeLangue;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class LangueModel extends Entite {
	private Long langId;

	private String key;

	private String title;

	private String alt;

	private Collection<TermeLangue> termeLangues;

	public Long getLangId() {
		return langId;
	}

	public void setLangId(Long langId) {
		this.langId = langId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public Collection<TermeLangue> getTermeLangues() {
		return termeLangues;
	}

	public void setTermeLangues(Collection<TermeLangue> termeLangues) {
		this.termeLangues = termeLangues;
	}

	public LangueModel() {
	}

	public LangueModel(Langue l) {
		setAlt(l.getAlt());
		setKey(l.getCodeLangue());
		setLangId(l.getLangId());
		setTermeLangues(l.getTermeLangues());
		setTitle(l.getTitle());
	}
}