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
@Table(name="PIX_PLANNING")
public class PixPlanning {
   /* @Column(name="PLAN_ID")
    String ;
    @Column(name="PLAN_VERSION")
    String ;*/
    @Column(name="BBD")
    String  bbd;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="ISSUE_DATE")
    String  issueDate;
    @Column(name="ISSUED_BY")
    String  issuedBy;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="MODIFIED_BY")
    String  modifiedBy;
    @Column(name="PLAN_ID")
    String  planId;
    @Column(name="PLAN_VERSION")
    String  planVersion;
    @Column(name="QUANTITY")
    String  quantity;
    @Column(name="STATUS_ID")
    String  statusDetail;
    @Column(name="TITLE_ID")
    String  titleDetail;
    @Column(name="TRANSACTION_HISTORY_NO")
    String  transactionHistoryNo;
    @Column(name="UOM_ID")
    String  UOMDetail;

}
