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
@Table(name = "PIX_BOOK_SPEC_CLASSIF")
public class BookSpecClassif {

    @Id
    BookSpecClassIfComposite classSpecIfComposite;

    @Column(name="DESCRIPTION")
    String  description;


}
@Embeddable
class BookSpecClassIfComposite implements Serializable
{
    @Column(name="CLASSIF_CODE")
    String  classifCode;

    /*@ManyToOne
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID")
    BookSpecLine specId;

    @ManyToOne
    @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    BookSpecLine specVersion;

    @ManyToOne
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    BookSpecLine specLineNo;*/
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID"),
            @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO"),
            @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    })
    BookSpecLine specLine;
}