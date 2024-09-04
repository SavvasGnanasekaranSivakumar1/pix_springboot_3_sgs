package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_BOOK_SPEC_LINE")
public class BookSpecLine {
    @Id
    BookSpecLineComposite specLineComposite;

    @Column(name="AGENCY")
    String  agency;
    @Column(name="ASSE_INSTRUCTIONS")
    String  asseInstructions;
    @Column(name="COMP_PER_PRODUCTION")
    String  compPerProduction;
    @Column(name="FINISHED_GOOD_FLAG")
    String  finishedGoodFlag;
    @Column(name="PRODUCT_CODE")
    String  productCode;
    @Column(name="PRODUCT_DESCRIPTION")
    String  productDescription;
    @ManyToOne
    @JoinColumn(name="PRODUCT_TYPE_ID",referencedColumnName = "REF_ID")
    Reference  productTypeDetail;


}
@Embeddable
class BookSpecLineComposite implements Serializable
{
    @Column(name="SPEC_LINE_NO")
    Long  specLineNo;
    /*@ManyToOne
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID")
    BookSpec  specId;
    @ManyToOne
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    BookSpec  specVersion;*/
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "SPEC_ID", referencedColumnName = "SPEC_ID"),
            @JoinColumn(name = "SPEC_VERSION", referencedColumnName = "SPEC_VERSION")
    })
    BookSpec spec;

}