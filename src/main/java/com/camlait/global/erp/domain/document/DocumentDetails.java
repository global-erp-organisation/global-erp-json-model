package com.camlait.global.erp.domain.document;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.camlait.global.erp.domain.BaseEntity;
import com.camlait.global.erp.domain.enumeration.EnumTypeEntitity;
import com.camlait.global.erp.domain.enumeration.OperationDirection;
import com.camlait.global.erp.domain.product.ProductModel;
import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@AllArgsConstructor(suppressConstructorProperties = true)
@Data
@EqualsAndHashCode(callSuper = false, exclude = "documentDetailsTaxes")
@ToString(exclude = "documentDetailsTaxes")
@Builder
public class DocumentDetails extends BaseEntity {

    private String docDetailId;

    private String productCode;
    private ProductModel product;

    private Long lineQuantity;

    private double lineUnitPrice;

    private String documenId;

    private Document document;

    @Enumerated(EnumType.STRING)
    private OperationDirection operationDirection;

    private Collection<DocumentDetailsTax> documentDetailsTaxes = Lists.newArrayList();

    public DocumentDetails() {
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
}
