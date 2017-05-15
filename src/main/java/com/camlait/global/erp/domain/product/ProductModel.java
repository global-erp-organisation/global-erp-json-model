package com.camlait.global.erp.domain.product;

import java.util.Collection;

import com.camlait.global.erp.domain.BaseEntityModel;
import com.camlait.global.erp.domain.document.business.Tax;
import com.google.common.collect.Lists;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@SuppressWarnings("serial")
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public class ProductModel extends BaseEntityModel {

    @ApiModelProperty(hidden = true)
    private String productId;
    private String productCode;
    private String productDescription;
    private String productCategoryId;
    private String productCategoryCode;
    private boolean taxableProduct;
    private Double defaultUnitprice;
    private boolean stockFollowing;
    private Collection<Tax> taxes = Lists.newArrayList();

    public ProductModel() {
    }

       
    public static ProductModel fromProduct(Product p){
        return ProductModel.builder()
                .productId(p.getProductId())
                .productCode(p.getProductCode())
                .productDescription(p.getProductDescription())
                .taxableProduct(p.isTaxableProduct())
                .defaultUnitprice(p.getDefaultUnitprice())
                .stockFollowing(p.isStockFollowing())
                .taxes(p.getTaxes())
                .productCategoryCode(p.getCategory().getProductCategoryCode())
                .productCategoryId(p.getProductCategoryId())
                .build();
    }
    
    public static Product fromProductModel(ProductModel p){
        return Product.builder()
                .productId(p.getProductId())
                .productCode(p.getProductCode())
                .productDescription(p.getProductDescription())
                .taxableProduct(p.isTaxableProduct())
                .defaultUnitprice(p.getDefaultUnitprice())
                .stockFollowing(p.isStockFollowing())
                .taxes(p.getTaxes())
                .build();
    }

}
