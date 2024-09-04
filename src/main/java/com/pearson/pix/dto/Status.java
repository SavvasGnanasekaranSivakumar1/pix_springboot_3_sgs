package com.pearson.pix.dto;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_STATUS_CODE")
public class Status {
    @Id
    @Column(name="STATUS_ID")
    Long statusId;

    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="DISPLAY_ORDER")
    String  displayOrder;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="STATUS_CODE")
    String  statusCode;
    @Column(name="STATUS_DESCRIPTION")
    String  statusDescription;

    @ManyToOne
    @JoinColumn(name="TABLE_ID",referencedColumnName = "TABLE_ID")
    TableData  tableDetail;


}
