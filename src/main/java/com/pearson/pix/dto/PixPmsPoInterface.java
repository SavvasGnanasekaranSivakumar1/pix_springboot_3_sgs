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
@Table(name="PIX_PMS_PO_INTERFACE")
public class PixPmsPoInterface {
//    @Column(name="PO_INTERFACE_ID")
//    String ;
    @Column(name="COMMENTS")
    String  comments;
    @Column(name="DELIVERY_DATE")
    String  deliveryDate;
    @Column(name="ERROR_DESC")
    String  errorDesc;
    @Column(name="PO_INTERFACE_ID")
    String  poInterfaceId;
    @Column(name="PO_LINE_NO")
    String  poLineNo;
    @Column(name="PO_NUMBER")
    String  poNumber;
    @Column(name="PROCESSED_FLAG")
    String  processedFlag;
    @Column(name="STATUS")
    String  status;
}
