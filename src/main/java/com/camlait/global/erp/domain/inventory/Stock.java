package com.camlait.global.erp.domain.inventory;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.camlait.global.erp.domain.BaseEntity;
import com.camlait.global.erp.domain.enumeration.EnumTypeEntitity;
import com.camlait.global.erp.domain.keys.StockKey;
import com.camlait.global.erp.domain.product.ProductModel;
import com.camlait.global.erp.domain.warehouse.Store;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Entity
@AllArgsConstructor(suppressConstructorProperties = true)
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@Table(name = "`inv-stocks`")
@IdClass(value = StockKey.class)
public class Stock extends BaseEntity {

    @Transient
    private String productId;

    @Id
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private ProductModel product;

    @Transient
    private String storeId;

    @Id
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "storeId")
    private Store store;

    private Long availableQuantity;

    public Stock() {
    }

    @Override
    public void postConstructOperation() {
        setStoreId(store.getStoreId());
        setProductId(product.getProductId());
    }

    @Override
    public EnumTypeEntitity toEnum() {
        return null;
    }
}
