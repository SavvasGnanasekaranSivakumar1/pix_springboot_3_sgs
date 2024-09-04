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
@Table(name="PIX_ETL_BOOK_SPEC_MISC_CES")
public class PixEtlBookSpecMiscCes {
    /*@Column(name="COMPONENT_ID")
    String ;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="PRODUCT_ID")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="COMPONENT_TYPE")
    String  componentType;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="LABEL")
    String  label;
    @Column(name="TRANSACTION_NUMBER")
    String  pixEtlBookSpecLineCes;
    /*@Column(name="PRODUCT_ID")
    String ;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="COMPONENT_ID")
    String ;*/
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="VALUE")
    String  value;

}
