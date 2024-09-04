package com.pearson.pix.dto;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_BOOK_SPEC_MEDIA")
public class BookSpecMedia {
    @Id
    BookSpecMediaComposite composite;

    @Column(name="CDR_TYPE")
    String  cdrType;
    @Column(name="FORMAT_TYPE")
    String  formatType;
    @Column(name="LABEL_COLOR_DESC")
    String  labelColorDesc;
    @Column(name="MEDIA_LENGTH")
    String  mediaLength;

    @ManyToOne
    @JoinColumn(name="MEDIA_SOURCE_ID",referencedColumnName = "REF_ID")
    Reference  mediaSourceDetail;

    @Column(name="NO_OF_COLORS")
    String  noOfColors;
    @Column(name="PRESS_PREINPUT_TYPE")
    String  pressPreinputType;
    @Column(name="PRINTING")
    String  printing;
    @Column(name="SLIDE_COLOUR_CODE")
    String  slideColourCode;
    @Column(name="SLIDE_COUNTAINER_DESC")
    String  slideCountainerDesc;
    @Column(name="SLIDE_LENGTH")
    String  slideLength;
    @Column(name="SLIDE_LENGTH_UOM_ID")
    String  slideLengthUomId;
    @Column(name="SLIDE_MOUNT_MATERIAL")
    String  slideMountMaterial;
    @Column(name="SLIDE_MOUNT_MATERIAL_DESC")
    String  slideMountMaterialDesc;
    @Column(name="SLIDE_PAGES_PER_SET")
    String  slidePagesPerSet;
    @Column(name="SLIDE_PER_PAGES")
    String  slidePerPages;
    @Column(name="SLIDE_SEQ_NO")
    String  slideSeqNo;
    @Column(name="SLIDE_WIDTH")
    String  slideWidth;
    @Column(name="SLIDE_WIDTH_UOM_ID")
    String  slideWidthUomId;


    @Column(name="WRAP_TYPE")
    String  wrapType;

}
@Embeddable
class BookSpecMediaComposite implements Serializable
{
    /*@ManyToOne
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID")
    BookSpecNonPress  specId;
    @ManyToOne
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    BookSpecNonPress  specVersion;
    @ManyToOne
    @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    BookSpecNonPress  specLineNo;*/
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID"),
            @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION"),
            @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    })
    BookSpecNonPress  specNonPress;

}