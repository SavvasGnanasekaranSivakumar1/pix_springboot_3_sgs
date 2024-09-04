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
@Table(name = "PIX_BOOK_SPEC_NON_PRESS")
public class BookSpecNonPress {
    @Id
    BookSpecNonPressComposite composite;

    @Column(name="MASTER_STORAGE_OPTION")
    String  masterStorageOption;


    @Column(name="TOTAL_UNITS")
    String  totalUnits;

}
@Embeddable
class BookSpecNonPressComposite implements Serializable
{
    /*@ManyToOne
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
