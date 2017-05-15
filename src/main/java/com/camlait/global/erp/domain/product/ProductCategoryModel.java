package com.camlait.global.erp.domain.product;

import java.util.Collection;
import java.util.stream.Collectors;

import com.camlait.global.erp.domain.BaseEntityModel;
import com.camlait.global.erp.domain.document.business.Tax;
import com.camlait.global.erp.domain.enumeration.Scope;
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
@EqualsAndHashCode(callSuper = false, exclude = {"products"})
@ToString(exclude = {"products"})
@Builder
public class ProductCategoryModel extends BaseEntityModel {

    @ApiModelProperty(hidden = true)
    private String productCategoryId;
    private String productCategoryParentId;
    private String parentCategoryCode;
    private String productCategoryCode;
    private String categoryDescription;
    private Scope scope;
    private boolean taxableCategory;
    private boolean stockFollowing;

    @ApiModelProperty(hidden = true)
    private Collection<ProductModel> products = Lists.newArrayList();
    private Collection<Tax> taxes = Lists.newArrayList();

    public ProductCategoryModel() {
    }

    public static ProductCategoryModel fromCategory(ProductCategory c) {
        final Collection<ProductModel> p = c.getProducts().stream().map(e -> {
            return ProductModel.fromProduct(e);
        }).collect(Collectors.toList());

        return ProductCategoryModel.builder().categoryDescription(c.getCategoryDescription())
                .parentCategoryCode(c.getParentCategory().getProductCategoryCode()).productCategoryId(c.getParentCategoryId()).scope(c.getScope())
                .stockFollowing(c.isStockFollowing()).taxableCategory(c.isTaxableCategory()).products(p).build();
    }

    public static ProductCategory fromCategoryModel(ProductCategoryModel c) {
        final Collection<Product> p = c.getProducts().stream().map(e -> {
            return ProductModel.fromProductModel(e);
        }).collect(Collectors.toList());

        return ProductCategory.builder().categoryDescription(c.getCategoryDescription()).parentCategoryId(c.getProductCategoryId())
                .productCategoryId(c.getProductCategoryId()).scope(c.getScope()).stockFollowing(c.isStockFollowing())
                .taxableCategory(c.isTaxableCategory()).products(p).build();
    }
}
