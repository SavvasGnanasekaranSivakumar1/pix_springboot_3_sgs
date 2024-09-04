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
@Table(name="PIX_ETL_PO_LINE_CES")
public class PixEtlPoLineCes {
    /*@Column(name="COMPONENT_ID")
    String ;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="COMPONENT_DESCR")
    String  componentDescr;
    @Column(name="COMPONENT_ID")
    String  componentId;
    @Column(name="COMPONENT_LEVEL_STATUS")
    String  componentLevelStatus;
    @Column(name="COMPONENT_NOTES")
    String  componentNotes;
    @Column(name="COMPONENT_QTY")
    String  componentQty;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String  componentSeqNumber;
    @Column(name="DELIVERY_DATE")
    String  deliveryDate;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="PRODUCT_ID")
    String  productId;
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
    @Column(name="TRANSACTION_NUMBER")
    String  transactionNumber;
    @Column(name="UOM")
    String  uom;

}
