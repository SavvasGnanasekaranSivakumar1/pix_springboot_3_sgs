package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_BOOK_SPEC")
public class BookSpec {
    @Id
    BookSpecComposite specIDVersion;

    @Column(name = "CREATED_BY")
    Date createdBy;
    @Column(name = "CREATION_DATE_TIME")
    Date creationDateTime;
    @Column(name = "MOD_DATE_TIME")
    Date modDateTime;
    @Column(name = "MODIFIED_BY")
    String modifiedBy;
    @Column(name = "NASTA")
    String nasta;
    @Column(name = "RELEASE_NO")
    Long releaseNo;
    @Column(name = "SPEC_ISSUE_DATE")
    Date specIssueDate;
    @Column(name = "SPEC_NO")
    String specNo;
    @ManyToOne
    @JoinColumn(name = "STATUS_ID",referencedColumnName = "STATUS_ID")
    Status statusDetail;
    @ManyToOne
    @JoinColumn(name = "TITLE_ID",referencedColumnName = "TITLE_ID")
    TitlePrinting titleDetail;
    @Column(name = "TOTAL_PAGE_COUNT")
    Long totalPageCount;
    @Column(name = "TRANSACTION_HISTORY_NO")
    String transactionHistoryNo;
}
@Embeddable
class BookSpecComposite implements Serializable
{
    @Column(name ="SPEC_ID")
    Long specId;
    @Column(name = "SPEC_VERSION")
    Long specVersion;
}