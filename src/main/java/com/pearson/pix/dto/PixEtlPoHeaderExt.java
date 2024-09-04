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
@Table(name="PIX_ETL_PO_HEADER_EXT")
public class PixEtlPoHeaderExt {
    /*@Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="TRANSACTION_NUMBER")
    String  transactionNumber;
    @Column(name="AUTHOR")
    String  author;
    @Column(name="EDITION")
    String  edition;
    @Column(name="COPYRIGHT")
    String  copyright;
    @Column(name="STD_CASE_PACK_QTY")
    String  stdCasePackQty;
    @Column(name="VENDOR_PLANT_CODE")
    String  vendorPlantCode;
    @Column(name="SAP_VENDOR_NUMBER")
    String  sapVendorNumber;
    @Column(name="BOOK_BULK")
    String  bookBulk;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;

}
