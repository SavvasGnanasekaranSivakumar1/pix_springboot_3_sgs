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
@Table(name="PIX_ETL_BOOK_SPEC_PRESS_CES")
public class PixEtlBookSpecPressCes {
    /*@Column(name="COMPONENT_ID")
    String ;
    @Column(name="COMPONENT_SEQ_NUMBER")
    String ;
    @Column(name="PRODUCT_ID")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="BASIS_WT")
    String  basisWt;
    @Column(name="BASIS_WT_UOM")
    String  basisWtUom;
    @Column(name="COLOR_DESCR")
    String  colorDescr;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="INK_COLOR_SPECS")
    String  inkColorSpecs;
    @Column(name="MARGIN_FOOTER_BLEED")
    String  marginFooterBleed;
    @Column(name="MARGIN_FOOTER_UOM")
    String  marginFooterUom;
    @Column(name="MARGIN_FOOTER_VALUE")
    String  marginFooterValue;
    @Column(name="MARGIN_GUTTER_BLEED")
    String  marginGutterBleed;
    @Column(name="MARGIN_GUTTER_UOM")
    String  marginGutterUom;
    @Column(name="MARGIN_GUTTER_VALUE")
    String  marginGutterValue;
    @Column(name="MARGIN_HEADER_BLEED")
    String  marginHeaderBleed;
    @Column(name="MARGIN_HEADER_UOM")
    String  marginHeaderUom;
    @Column(name="MARGIN_HEADER_VALUE")
    String  marginHeaderValue;
    @Column(name="MARGIN_THUMB_BLEED")
    String  marginThumbBleed;
    @Column(name="MARGIN_THUMB_UOM")
    String  marginThumbUom;
    @Column(name="MARGIN_THUMB_VALUE")
    String  marginThumbValue;
    @Column(name="NO_OF_PAGES")
    String  noOfPages;
    @Column(name="NO_OF_SIGN")
    String  noOfSign;
    @Column(name="NUMBER_COLORS")
    String  numberColors;
    @Column(name="PAGES_PER_SIGN")
    String  pagesPerSign;
    @Column(name="PER_FO_EDGE_DISTANCE")
    String  perFoEdgeDistance;
    @Column(name="PER_FO_TYPE")
    String  perFoType;
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
    @Column(name="PPI")
    String  ppi;
    @Column(name="PPI_UOM")
    String  ppiUom;
    @Column(name="PRESS_LENGTH")
    String  pressLength;
    @Column(name="PRESS_LENGTH_UOM")
    String  pressLengthUom;
    @Column(name="PRESS_PREP_INPUT_TYPE")
    String  pressPrepInputType;
    @Column(name="PRESS_TYPE")
    String  pressType;
    @Column(name="TRIM_SIZE_DESCR")
    String  trimSizeDescr;
    @Column(name="WIDTH")
    String  width;
    @Column(name="WIDTH_UOM")
    String  widthUom;

}
