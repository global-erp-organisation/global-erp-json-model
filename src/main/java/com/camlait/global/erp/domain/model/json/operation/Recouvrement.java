package com.camlait.global.erp.domain.model.json.operation;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.model.json.bmq.Bmq;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Recouvrement extends Operation {

	private Bmq bmq;

	public Bmq getBmq() {
		return bmq;
	}

	public void setBmq(Bmq bmq) {
		this.bmq = bmq;
	}

	public Recouvrement() {
		setSensOperation(SensOperation.ENTREE);
	}
}
