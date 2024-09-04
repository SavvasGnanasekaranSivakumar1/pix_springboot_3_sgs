package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ETL_BOOK_SPEC_CES")
public class PixEtlBookSpecCes {
    @Id
    @Column(name="TRANSACTION_NUMBER")
    Long  transactionNumber;
    @Column(name="BUYER_ADDRESS1")
    String  buyerAddress1;
    @Column(name="BUYER_ADDRESS2")
    String  buyerAddress2;
    @Column(name="BUYER_CITY")
    String  buyerCity;
    @Column(name="BUYER_COMMENTS")
    String  buyerComments;
    @Column(name="BUYER_COUNTRY_CODE")
    String  buyerCountryCode;
    @Column(name="BUYER_EMAIL")
    String  buyerEmail;
    @Column(name="BUYER_FAX")
    String  buyerFax;
    @Column(name="BUYER_NAME_FIRST")
    String  buyerNameFirst;
    @Column(name="BUYER_NAME_LAST")
    String  buyerNameLast;
    @Column(name="BUYER_PHONE")
    String  buyerPhone;
    @Column(name="BUYER_STATE")
    String  buyerState;
    @Column(name="BUYER_ZIP")
    String  buyerZip;
    @Column(name="ERROR_DESCR")
    String  errorDescr;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="FINISHED_GOOD_FLAG")
    String  finishedGoodFlag;
    @Column(name="NASTA_SPEC")
    String  nastaSpec;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="PRINTING_NUMBER")
    String  printingNumber;
    @Column(name="PUBLISHER_NAME")
    String  publisherName;
    @Column(name="PUBLISHER_SAN_NUMBER")
    String  publisherSanNumber;
    @Column(name="SPEC_ISSUE_DATE")
    String  specIssueDate;
    @Column(name="SUPPLIER_ADDRESS1")
    String  supplierAddress1;
    @Column(name="SUPPLIER_ADDRESS2")
    String  supplierAddress2;
    @Column(name="SUPPLIER_CITY")
    String  supplierCity;
    @Column(name="SUPPLIER_CONTACT")
    String  supplierContact;
    @Column(name="SUPPLIER_COUNTRY_CODE")
    String  supplierCountryCode;
    @Column(name="SUPPLIER_FAX")
    String  supplierFax;
    @Column(name="SUPPLIER_LONG_NAME")
    String  supplierLongName;
    @Column(name="SUPPLIER_PHONE")
    String  supplierPhone;
    @Column(name="SUPPLIER_SAN_NUMBER")
    String  supplierSanNumber;
    @Column(name="SUPPLIER_STATE")
    String  supplierState;
    @Column(name="SUPPLIER_ZIP")
    String  supplierZip;
    @Column(name="TITLE_ISBN10")
    String  titleIsbn10;
    @Column(name="TITLE_ISBN13")
    String  titleIsbn13;
    @Column(name="TOTAL_PAGE_COUNT")
    String  totalPageCount;


}
