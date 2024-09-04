package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_DELIVERY_MSG_FILE")
public class PixDeliveryMsgFiles {
    @Id
    @Column(name="FILE_ID")
    Long  fileSeq;

    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
    @Column(name="BILL_OF_LADING")
    String  billOfLaiding;
    @Column(name="CARRIER_NO")
    String  carrierNo;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;

    @Column(name="FILE_URL")
    String  fileUrl;
    @Column(name="FREIGHT_NO")
    String  frieghtNo;
    @Column(name="MODIFICATION_DATE_TIME")
    String  modificationDateTime;
    @Column(name="MODIFIED_BY")
    String  modifiedBy;
    /*@Column(name="MSG_ID")
    String  msgId;*/
    @ManyToOne
    @JoinColumn(name="MSG_ID",referencedColumnName = "USER_ID")
    PixAdminUser  msgId;
    @Column(name="MSG_LINE_NO")
    String  msgLineNo;
    @Column(name="PMS_TRANSACTION_DATE")
    String  pmsTransactionDate;
    @Column(name="PO_LINE_NO")
    String  poLineNo;
    @Column(name="PO_NO")
    String  poNo;

}
