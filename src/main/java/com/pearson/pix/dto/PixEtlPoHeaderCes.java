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
@Table(name="PIX_ETL_PO_HEADER_CES")
public class PixEtlPoHeaderCes {
/*    @Column(name="PO_NUMBER")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
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
    @Column(name="BUYERE_MAIL")
    String  buyereMail;
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
    @Column(name="DELIVERY_DATE")
    String  deliveryDate;
    @Column(name="ERROR_DESCR")
    String  errorDescr;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="ORDER_TYPE")
    String  orderType;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="PO_CREATION_DATE")
    String  poCreationDate;
    @Column(name="PO_NUMBER")
    String  poNumber;
    @Column(name="PO_STATUS")
    String  poStatus;
    @Column(name="PRINTING_NUMBER")
    String  printingNumber;
    @Column(name="PUBLISHER_NAME")
    String  publisherName;
    @Column(name="PUBLISHER_SAN_NUMBER")
    String  publisherSanNumber;
    @Column(name="RELEASE_NUMBER")
    String  releaseNumber;
    @Column(name="SHIP_TO_ADDRESS1")
    String  shipToAddress1;
    @Column(name="SHIP_TO_ADDRESS2")
    String  shipToAddress2;
    @Column(name="SHIP_TO_CITY")
    String  shipToCity;
    @Column(name="SHIP_TO_CONTACT")
    String  shipToContact;
    @Column(name="SHIP_TO_COUNTRY_CODE")
    String  shipToCountryCode;
    @Column(name="SHIP_TO_FAX")
    String  shipToFax;
    @Column(name="SHIP_TO_LONG_NAME")
    String  shipToLongName;
    @Column(name="SHIP_TO_PHONE")
    String  shipToPhone;
    @Column(name="SHIP_TO_SAN_NUMBER")
    String  shipToSanNumber;
    @Column(name="SHIP_TO_STATE")
    String  shipToState;
    @Column(name="SHIP_TO_ZIP")
    String  shipToZip;
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
    @Column(name="TITLE_DESC")
    String  titleDesc;
    @Column(name="TITLE_ISBN10")
    String  titleIsbn10;
    @Column(name="TITLE_ISBN13")
    String  titleIsbn13;
    @Column(name="TRANSACTION_NUMBER")
    String  transactionNumber;
    @Column(name="GANG")
    String  gangName;

}
