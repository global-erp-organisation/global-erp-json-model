package com.camlait.global.erp.domain.model.json.operation;

import com.camlait.global.erp.domain.enumeration.SensOperation;
import com.camlait.global.erp.domain.operation.Recouvrement;

public class RecouvrementModel extends OperationModel {

	private Long bmqId;

	public Long getBmqId() {
		return bmqId;
	}

	public void setBmqId(Long bmqId) {
		this.bmqId = bmqId;
	}

	public RecouvrementModel() {
		setSensOperation(SensOperation.ENTREE);
	}

	public RecouvrementModel(Recouvrement r) {
		super(r);
		setBmqId((r.getBmq()==null)?null:r.getBmq().getBmqId());
	}

}
