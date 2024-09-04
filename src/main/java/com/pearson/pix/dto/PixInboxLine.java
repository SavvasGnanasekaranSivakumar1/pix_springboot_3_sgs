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
@Table(name="PIX_INBOX_LINE")
public class PixInboxLine {
/*    @Column(name="INBOX_ID")
    String ;
    @Column(name="INBOX_LINE_NO")
    String ;*/
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="INBOX_ID")
    String  inboxId;
    @Column(name="INBOX_LINE_NO")
    String  inboxLineNo;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="TRANREF_ID_1")
    String  tranrefId1;
    @Column(name="TRAN_REF_ID_2")
    String  tranRefId2;

}
