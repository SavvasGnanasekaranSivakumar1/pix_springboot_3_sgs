package com.pearson.pix.dto;

import javax.persistence.*;
import javax.persistence.Column;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_BOOK_SPEC_PRESS")
public class BookSpecPress
{
    @Id
    BookSpecPressComposite composite;

    @Column(name="BARCODE")String  barcode;
    @Column(name="BASIS_WT")
    String  basisWt;
    @ManyToOne
    @JoinColumn(name="BASIS_WT_UOM_ID",referencedColumnName = "UOM_ID")
    UOM  basisWtUomDetail;
    @Column(name="COLOR_DESC")
    String  colorDesc;
    @Column(name="INK_COLOUR_SPECS")
    String  inkColourSpecs;
    @Column(name="LENGTH")
    String  length;
    @ManyToOne
    @JoinColumn(name="LENGTH_UOM_ID",referencedColumnName = "UOM_ID")
    UOM  lengthUomDetail;
    @Column(name="NO_OF_COLORS")
    String  noOfColors;
    @Column(name="NO_OF_PAGES")
    String  noOfPages;
    @Column(name="NO_OF_SIGN")
    String  noOfSign;
    @Column(name="PAGES_PER_SIGN")
    String  pagesPerSign;
    @Column(name="PERFO_EDGE_DISTANCE")
    String  perfoEdgeDistance;
    @Column(name="PERFO_TYPE")
    String  perfoType;
    @Column(name="PPI")
    String  ppi;
    @ManyToOne
    @JoinColumn(name="PPI_UOM_ID",referencedColumnName = "UOM_ID")
    UOM  ppiUomDetail;
    @Column(name="PRESS_PREP_INPUT_TYPE")
    String  pressPrepInputType;
    @Column(name="PRESS_TYPE")
    String  pressType;
    @Column(name="PRINT_PRODUCT_CODE")
    String  printProductCode;
    @Column(name="PRINT_PRODUCT_DESCRIPTION")
    String  printProductDescription;

    @Column(name="TRIM_SIZE_DESC")
    String  trimSizeDesc;
    @Column(name="WIDTH")
    String  width;
    @ManyToOne
    @JoinColumn(name="WIDTH_UOM_ID",referencedColumnName = "UOM_ID")
    UOM  widthUomDetail;
}

@Embeddable
class BookSpecPressComposite implements Serializable
{

    /*  @ManyToOne
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID")
    BookSpecLine  specId;
    @ManyToOne
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    BookSpecLine  specVersion;
    @ManyToOne
    @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    BookSpecLine  specLineNo;*/

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID"),
            @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION"),
            @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    })
    BookSpecLine  specLine;

}