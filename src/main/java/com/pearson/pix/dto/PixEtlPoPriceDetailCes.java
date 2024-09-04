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
@Table(name="PIX_ETL_PO_PRICE_DETAIL_CES")
public class PixEtlPoPriceDetailCes {
/*    @Column(name="COMPONENT_ID")
    String ;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="GL_CODE")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="COMPONENT_ID")
    String  componentId;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String  componentSeqNumber;
    @Column(name="COST")
    String  cost;
    @Column(name="CURRENCY_CODE")
    String  currencyCode;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="GL_CODE")
    String  glCode;
    @Column(name="GL_CODEDESCR")
    String  glCodedescr;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="TRANSACTION_NUMBER")
    String  transactionNumber;

}
