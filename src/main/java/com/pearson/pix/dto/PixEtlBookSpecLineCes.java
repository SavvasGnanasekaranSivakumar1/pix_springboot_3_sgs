package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ETL_BOOK_SPEC_LINE_CES")
public class PixEtlBookSpecLineCes {
   /* @Column(name="COMPONENT_ID")
    String ;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="PRODUCT_ID")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="COMPONENT_DESCR")
    String  componentDescr;
    @Column(name="COMPONENT_ID")
    String  componentId;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String  componentSeqNumber;
    @Column(name="COMPONENT_TYPE")
    String  componentType;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="FINISHED_GOOD_COMPONENT")
    String  finishedGoodComponent;
    @Column(name="NO_OF_COMP")
    String  noOfComp;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="PRODUCT_ID")
    String  productId;
    @Column(name="TRANSACTION_NUMBER")
    String  transactionNumber;

}
