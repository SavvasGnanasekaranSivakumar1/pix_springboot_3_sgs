package com.pearson.pix.dto;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_REF")
public class Reference {
    @Id
    @Column(name="REF_ID")
    Long refId;
    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="DESCRIPTION")
    String  description;
    @Column(name="DISPLAY_ORDER")
    String  displayOrder;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="MODIFIED_BY")
    String  modifiedBy;
    @Column(name="REF_CODE")
    String  refCode;

    @ManyToOne
    @JoinColumn(name="TABLE_ID",referencedColumnName = "TABLE_ID")
    TableData  tableDetail;

}
