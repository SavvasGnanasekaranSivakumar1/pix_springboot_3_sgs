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
@Table(name="PIX_PO_HEADER")
public class PixPoHeader {
    @Id
    PixPOHeaderComposite composite;
    /*@Column(name="PO_ID")
    String ;
    @Column(name="PO_VERSION")
    String ;*/
    @Column(name="ACKNOWLEDGE_FLAG")
    String  acknowledgeFlag;
    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
   /* @Column(name="SPEC_VERSION")
    String  bookSpecDetail;*/
//    @Column(name="SPEC_ID")
//    String ;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    /*@Column(name="CURRENCY_CODE")
    String  currencyDetail;*/
    @ManyToOne
    @JoinColumn(name="CURRENCY_CODE",referencedColumnName = "CURRENCY_CODE")
    Currency  currencyDetail;
    @Column(name="ISSUE_DATE")
    String  issueDate;
    @Column(name="JOB_NO")
    String  jobNo;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="MODIFIED_BY")
    String  modifiedBy;
    @Column(name="ORDER_TYPE")
    String  orderType;

    @Column(name="PO_NO")
    String  poNo;
    @Column(name="POSTED_DATE")
    String  postedDate;

    @Column(name="RELEASE_NO")
    String  releaseNo;
    /*@Column(name="STATUS_ID")
    String  statusDetail;*/
    @ManyToOne
    @JoinColumn(name="STATUS_ID",referencedColumnName = "STATUS_ID")
    Status  statusCode;
    @Column(name="TERMS_CONDITIONS")
    String  termsConditions;
    @Column(name="GANG")
    String  gangName;
    @Column(name="TERMS_CONDITIONS1")
    String  termsConditions1;
    @Column(name="TITLE_DESC")
    String  titleDesc;
   /* @Column(name="TITLE_ID")
    String  titleDetail;*/
   @ManyToOne
   @JoinColumn(name="TITLE_ID",referencedColumnName = "TITLE_ID")
   TitlePrinting  titleDetail;
    @Column(name="TOTAL_AMOUNT")
    String  totalAmount;
    @Column(name="TOTAL_QUANTITY")
    String  totalQuantity;
    @Column(name="TRANSACTION_HISTORY_NO")
    String  transactionHistoryNo;
    /*@Column(name="UOM_ID")
    String  UOMDetail;*/
    @ManyToOne
    @JoinColumn(name="UOM_ID",referencedColumnName = "UOM_ID")
    UOM  UOMDetail;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "SPEC_ID", referencedColumnName = "SPEC_ID"),
            @JoinColumn(name = "SPEC_VERSION", referencedColumnName = "SPEC_VERSION")
    })
    BookSpec spec;

}

@Embeddable
class PixPOHeaderComposite implements Serializable
{
    @Column(name="PO_ID")
    Long  poId;
    @Column(name="PO_VERSION")
    Long  poVersion;
}
