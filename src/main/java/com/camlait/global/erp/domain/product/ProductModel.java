package com.camlait.global.erp.domain.product;

import java.util.Collection;

import com.camlait.global.erp.domain.BaseEntity;
import com.camlait.global.erp.domain.document.business.Tax;
import com.camlait.global.erp.domain.enumeration.EnumTypeEntitity;
import com.camlait.global.erp.domain.inventory.Stock;
import com.camlait.global.erp.domain.inventory.StockCard;
import com.camlait.global.erp.domain.tarif.Tariffication;
import com.google.common.collect.Lists;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@SuppressWarnings("serial")
@AllArgsConstructor(suppressConstructorProperties = true)
@Data
@EqualsAndHashCode(callSuper = false, exclude = {"taxes", "stocks", "stockCards", "tarifications"})
@ToString(exclude = {"taxes", "stocks", "stockCards", "tarifications"})
@Builder
public class ProductModel extends BaseEntity {

    @ApiModelProperty(hidden = true)
    private String productId;
    private String productCode;
    private String productDescription;
    private String productCategoryCode;
    private boolean taxableProduct;
    private Double defaultUnitprice;
    private boolean stockFollowing;

    @ApiModelProperty(hidden = true)
    private Collection<Tax> taxes = Lists.newArrayList();
    @ApiModelProperty(hidden = true)
    private Collection<Stock> stocks = Lists.newArrayList();
    @ApiModelProperty(hidden = true)
    private Collection<StockCard> stockCards = Lists.newArrayList();
    @ApiModelProperty(hidden = true)
    private Collection<Tariffication> tarifications = Lists.newArrayList();

    public ProductModel() {
    }

    @Override
    public void postConstructOperation() {
        // TODO Auto-generated method stub

    }

    @Override
    public EnumTypeEntitity toEnum() {
        // TODO Auto-generated method stub
        return null;
    }
        
    public static ProductModel from(Product p){
        return ProductModel.builder()
                .productId(p.getProductId())
                .productCode(p.getProductCode())
                .productDescription(p.getProductDescription())
                .taxableProduct(p.isTaxableProduct())
                .defaultUnitprice(p.getDefaultUnitprice())
                .stockFollowing(p.isStockFollowing())
                .build();
    }
}
