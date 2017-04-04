package com.camlait.global.erp.domain.product;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.camlait.global.erp.domain.BaseEntity;
import com.camlait.global.erp.domain.document.business.Tax;
import com.camlait.global.erp.domain.enumeration.EnumTypeEntitity;
import com.camlait.global.erp.domain.enumeration.Scope;
import com.google.common.collect.Lists;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@AllArgsConstructor(suppressConstructorProperties = true)
@Data
@EqualsAndHashCode(callSuper = false, exclude = {"taxes", "categoryChildren", "products"})
@ToString(exclude = {"taxes", "categoryChildren", "products"})
@Builder
public class ProductCategoryModel extends BaseEntity {

    @ApiModelProperty(hidden = true)
    private String productCategoryId;
    private String parentCategoryCode;
    private String productCategoryCode;
    private String categoryDescription;
    @Enumerated(EnumType.STRING)
    private Scope scope;
    private boolean taxableCategory;
    private boolean stockFollowing;
    @ApiModelProperty(hidden = true)
    private Collection<ProductCategoryModel> categoryChildren = Lists.newArrayList();
    @ApiModelProperty(hidden = true)
    private Collection<ProductModel> products = Lists.newArrayList();
    @ApiModelProperty(hidden = true)
    private Collection<Tax> taxes = Lists.newArrayList();

    public ProductCategoryModel() {
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

    public static ProductCategoryModel from(ProductCategory c) {
        final Collection<ProductModel> p = c.getProducts().stream().map(e->{
            return ProductModel.from(e);
        }).collect(Collectors.toList());
        
        return ProductCategoryModel.builder()
                .categoryDescription(c.getCategoryDescription())
                .parentCategoryCode(c.getParentCategory().getProductCategoryCode())
                .productCategoryId(c.getParentCategoryId())
                .scope(c.getScope())
                .stockFollowing(c.isStockFollowing())
                .taxableCategory(c.isTaxableCategory())
                .products(p)
                .build();       
    }
    
    
}
