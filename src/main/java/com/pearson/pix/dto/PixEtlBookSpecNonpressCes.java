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
@Table(name="PIX_ETL_BOOK_SPEC_NONPRESS_CES")
public class PixEtlBookSpecNonpressCes {
/*    @Column(name="COMPONENT_ID")
    String ;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="PRODUCT_ID")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="CD_TYPE")
    String  cdType;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="FORMAT_TYPE")
    String  formatType;
    @Column(name="LABEL_COLOR_DESCR")
    String  labelColorDescr;
    @Column(name="MASTER_STORAGE_OPTION")
    String  masterStorageOption;
    @Column(name="MEDIA_LENGTH")
    String  mediaLength;
    @Column(name="MEDIA_TYPE")
    String  mediaType;
    @Column(name="NO_OF_COLORS")
    String  noOfColors;
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
    @Column(name="SLIDE_COLOR_CODE")
    String  slideColorCode;
    @Column(name="SLIDE_CONTAINER_DESCR")
    String  slideContainerDescr;
    @Column(name="SLIDE_LENGTH")
    String  slideLength;
    @Column(name="SLIDE_LENGTH_UOM")
    String  slideLengthUom;
    @Column(name="SLIDE_MOUNT_MATERIAL")
    String  slideMountMaterial;
    @Column(name="SLIDE_MOUNT_MATERIAL_DESCR")
    String  slideMountMaterialDescr;
    @Column(name="SLIDE_PAGES_PER_SET")
    String  slidePagesPerSet;
    @Column(name="SLIDE_PER_PAGES")
    String  slidePerPages;
    @Column(name="SLIDE_SEQ_NO")
    String  slideSeqNo;
    @Column(name="SLIDE_WIDTH")
    String  slideWidth;
    @Column(name="SLIDE_WIDTH_UOM")
    String  slideWidthUom;
    @Column(name="TOTAL_UNITS")
    String  totalUnits;
    @Column(name="WRAP_TYPE")
    String  wrapType;

}
