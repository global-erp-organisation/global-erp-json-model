package com.camlait.global.erp.domain.keys;

import java.io.Serializable;

import com.camlait.global.erp.domain.localization.Zone;
import com.camlait.global.erp.domain.product.ProductModel;
import com.camlait.global.erp.domain.tarif.PriceType;
import com.camlait.global.erp.domain.tarif.Tariff;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class TarifficationKey implements Serializable {
    private Zone zone;
    private ProductModel product;
    private Tariff tarif;
    private PriceType priceType;
}
