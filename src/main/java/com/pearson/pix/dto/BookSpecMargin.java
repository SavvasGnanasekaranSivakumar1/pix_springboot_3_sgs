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
@Table(name = "PIX_BOOK_SPEC_MARGIN")
public class BookSpecMargin {
    @Id
    BookSpecMarginComposite composite;

    @Column(name="BLEED")
    String  bleed;

    @ManyToOne
    @JoinColumn(name="MARGIN_ID",referencedColumnName = "REF_ID")
    Reference  productTypeDetail;

    @ManyToOne
    @JoinColumn(name="UOM_ID",referencedColumnName = "UOM_ID")
    UOM  UOMDetail;
    @Column(name="VALUE")
    String  value;

}
@Embeddable
class BookSpecMarginComposite implements Serializable
{
    /*@ManyToOne
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID")
    BookSpecPress  specId;
    @ManyToOne
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    BookSpecPress  specVersion;
    @ManyToOne
    @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    BookSpecPress  specLineNo;*/

    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID"),
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION"),
            @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    })
    BookSpecPress  specPress;
}