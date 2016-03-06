package com.camlait.global.erp.domain.model.json.operation;

import com.camlait.global.erp.domain.operation.Recouvrement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class RecouvrementModel extends OperationModel {

	private Long bmqId;


	public RecouvrementModel(Recouvrement r) {
		super(r);
		setBmqId((r.getBmq()==null)?null:r.getBmq().getBmqId());
	}

}
