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
public class BookSpecMisc {
    @Id
    BookSpecMiscComposite composite;

    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDate;
    @Column(name="LABEL")
    String  label;
    @Column(name="MOD_DATE_TIME")
    String  lastModificationDate;
    @Column(name="MODIFIED_BY")
    String  lastModifiedBy;
    @Column(name="MISC_LINE_NO")
    Long  miscLineNo;

    @ManyToOne
    @JoinColumn(name="TABLE_ID",referencedColumnName = "TABLE_ID")
    TableData  tableDetail;
    @Column(name="VALUE")
    String  value;
}
@Embeddable
class BookSpecMiscComposite implements Serializable
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