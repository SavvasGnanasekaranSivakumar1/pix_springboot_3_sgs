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
@Table(name="PIX_PO_LINE")
public class PixPoLine {
    @Id
    PixPoLineComposite composite;
    @Column(name="ADDITIONAL_COMMENTS")
    String  additionalComments;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="ESTIMATED_DELIVERY_DATE")
    String  estimatedDeliveryDate;
    @Column(name="ESTIMATED_QUANTITY")
    String  estimatedQuantity;
    @Column(name="JOB_NO")
    String  jobNo;
    @Column(name="LINE_DECRIPTION")
    String  lineDecription;
    @Column(name="SPEC_LINE_NO")
    String  lineNo;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="MODIFIED_BY")
    String  modifiedBy;
    @Column(name="PO_ID")
    String  poId;

    @Column(name="PO_VERSION")
    String  poVersion;
    @Column(name="PRODUCT_CLASSIF_CODE")
    String  productClassifCode;
    @Column(name="PRODUCT_CLASSIF_DESCRIPTION")
    String  productClassifDescription;
    @Column(name="PRODUCT_CODE")
    String  productCode;
    @Column(name="PRODUCT_DESCRIPTION")
    String  productDescription;
    @Column(name="PUB_UNIT_COMMENTS")
    String  pubUnitComments;
    @Column(name="PUB_UNIT_COMMENTS1")
    String  pubUnitComments1;
   /* @Column(name="PUB_UNIT_STATUS_ID")
    String  pubUnitStatusDetail;*/
   @ManyToOne
   @JoinColumn(name="PUB_UNIT_STATUS_ID",referencedColumnName = "STATUS_ID")
   Status  pubUnitStatusDetail;
    @Column(name="REQUESTED_DELIVERY_DATE")
    String  requestedDeliveryDate;
    @Column(name="REQUESTED_QUANTITY")
    String  requestedQuantity;
   /* @Column(name="SPEC_ID")
    String  specId;
    @Column(name="SPEC_VERSION")
    String  specVersion;*/
   @ManyToOne
   @JoinColumns({
           @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID"),
           @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION"),
           @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
   })
   BookSpecLine  specLine;
    @Column(name="SUPPLIER_COMMENTS")
    String  supplierComments;
   /* @Column(name="SUPPLIER_STATUS_ID")
    String  supplierStatusId;*/
   @ManyToOne
   @JoinColumn(name="SUPPLIER_STATUS_ID",referencedColumnName = "STATUS_ID")
   Status  supplierStatusId;
   /* @Column(name="UOM_ID")
    String  UOMDetail;*/
   @ManyToOne
   @JoinColumn(name="UOM_ID",referencedColumnName = "UOM_ID")
   UOM  UOMDetail;

}
class PixPoLineComposite implements Serializable
{
 @Column(name="PO_LINE_NO")
 Long  poLineNo;


 @ManyToOne
 @JoinColumns({
         @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
         @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION")
 })
 PixPoHeader header;
}
