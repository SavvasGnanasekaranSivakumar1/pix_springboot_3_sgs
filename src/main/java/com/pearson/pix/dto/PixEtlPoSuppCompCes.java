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
@Table(name="PIX_ETL_PO_SUPP_COMP_CES")
public class PixEtlPoSuppCompCes {
   /* @Column(name="SUPPLIED_COMPONENT_ID")
    String ;
    @Column(name="SUPPLIED_COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="COMPONENT_ID")
    String  componentId;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String  componentSeqNumber;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="PRODUCT_ID")
    String  productId;
    @Column(name="SUPPLIED_COMPONENT_DESCR")
    String  suppliedComponentDescr;
    @Column(name="SUPPLIED_COMPONENT_DUE_DATE")
    String  suppliedComponentDueDate;
    @Column(name="SUPPLIED_COMPONENT_ID")
    String  suppliedComponentId;
    @Column(name="SUPPLIED_COMPONENT_NOTES")
    String  suppliedComponentNotes;
    @Column(name="SUPPLIED_COMPONENT_QTY")
    String  suppliedComponentQty;
    @Column(name="SUPPLIED_COMPONENT_SEQ_NUMBER")
    String  suppliedComponentSeqNumber;
    @Column(name="SUPPLIED_VENDOR_SAN")
    String  suppliedVendorSan;
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
    @Column(name="SUPPLIER_STATE")
    String  supplierState;
    @Column(name="SUPPLIER_ZIP")
    String  supplierZip;
    @Column(name="TRANSACTION_NUMBER")
    String  transactionNumber;
    @Column(name="UOM")
    String  uom;

}
