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
@Table(name="PIX_ETL_PO_HEADER_NOTES_CES")
public class PixEtlPoHeaderNotesCes {
/*    @Column(name="NOTES_TYPE")
    String ;
    @Column(name="TRANSACTION_NUMBER")
    String ;*/
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="NOTES_DESCR")
    String  notesDescr;
    @Column(name="NOTES_TYPE")
    String  notesType;
    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="TRANSACTION_NUMBER")
    String  transactionNumber;

}
