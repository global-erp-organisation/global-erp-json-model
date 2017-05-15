package com.camlait.global.erp.domain.product;

import java.util.Collection;

import com.camlait.global.erp.domain.BaseEntityModel;
import com.camlait.global.erp.domain.document.business.Tax;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@SuppressWarnings("serial")
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true, exclude = {"products", "productCategories"})
@ToString(exclude = {"products", "productCategories"})
@Builder
public class TaxModel extends BaseEntityModel {
	
    private String taxId;
    private String taxCode;
    private String taxDescription;
    private double percentageValue;
    
    private Collection<ProductModel> products;
    private Collection<ProductCategoryModel> productCategories;

    public TaxModel() {
    }
    
    
    public static TaxModel fromTax(Tax t){
    	return TaxModel.builder()
    			.percentageValue(t.getPercentageValue())
    			.taxCode(t.getTaxCode())
    			.taxDescription(t.getTaxDescription())
    			.taxId(t.getTaxId())
    			.build();
    }
    
    public static Tax fromTaxModel(TaxModel t){
    	return Tax.builder()
    			.percentageValue(t.getPercentageValue())
    			.taxCode(t.getTaxCode())
    			.taxDescription(t.getTaxDescription())
    			.taxId(t.getTaxId())
    			.build();
    }
}
