package com.camlait.global.erp.domain.tarif;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.camlait.global.erp.domain.BaseEntity;
import com.camlait.global.erp.domain.enumeration.EnumTypeEntitity;
import com.camlait.global.erp.domain.keys.TarifficationKey;
import com.camlait.global.erp.domain.localization.Zone;
import com.camlait.global.erp.domain.product.ProductModel;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor(suppressConstructorProperties = true)
@Builder
@Table(name = "`tarif-tarifications`")
@IdClass(value = TarifficationKey.class)
public class Tariffication extends BaseEntity {

    @Transient
    private String zoneId;

    @Id
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "zoneId")
    private Zone zone;

    @Transient
    private String productId;

    @Id
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductModel product;

    @Transient
    private String tarifId;

    @Id
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "tarifId")
    private Tariff tarif;

    @Transient
    private String priceTypeId;

    @Id
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "priceTypeId")
    private PriceType priceType;

    private Double value;

    public Tariffication() {
    }

    @Override
    public void postConstructOperation() {
        setProductId(product.getProductId());
        setZoneId(zone.getLocalId());
        setTarifId(tarif.getTarifId());
        setPriceTypeId(priceType.getPriceTypeId());
    }

    @Override
    public EnumTypeEntitity toEnum() {
        return null;
    }
}
