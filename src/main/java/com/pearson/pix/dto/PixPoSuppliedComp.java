package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_PO_SUPPLIED_COMP")
public class PixPoSuppliedComp {
    @Id
    PixPOSuppliedComposite composite;

    @Column(name="PO_ID")
    String  poId;
    @Column(name="PO_LINE_NO")
    String  poLineNo;
    @Column(name="PO_VERSION")
    String  poVersion;
    @Column(name="PRODUCT_CODE")
    String  productCode;
    @Column(name="PRODUCT_DESCRIPTION")
    String  productDescription;
    @Column(name="PUB_UNIT_COMMENTS")
    String  pubUnitComments;
    @Column(name="QUANTITY")
    String  quantity;
    @Column(name="COMPONENT_TYPE")
    String  quantityType;
    @Column(name="SHIP_DATE")
    String  shipDate;

    /*@Column(name="UOM_ID")
    String  UOMDetail;*/
    @ManyToOne
    @JoinColumn(name="UOM_ID",referencedColumnName = "UOM_ID")
    UOM  UOMDetail;

}
@Embeddable
class PixPOSuppliedComposite implements Serializable
{
    @Column(name="SUPP_COMP_LINE_NO")
    Long  suppCompLineNo;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
            @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION"),
            @JoinColumn(name = "PO_LINE_NO", referencedColumnName = "PO_LINE_NO")
    })
    PixPoLine poLine;
}