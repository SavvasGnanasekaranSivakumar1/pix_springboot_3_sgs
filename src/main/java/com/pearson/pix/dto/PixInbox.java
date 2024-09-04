package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_INBOX")
public class PixInbox {
    @Id
    @Column(name="INBOX_ID")
    Long  inboxId;
    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
    @Column(name="COUNT")
    String  count;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="DISPLAY_ORDER")
    String  displayOrder;

    /*@Column(name="MODULE_ID")
    String  itemTypeDetail;*/
    @ManyToOne
    @JoinColumn(name="MODULE_ID",referencedColumnName = "REF_ID")
    Reference  moduleDetail;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="SAN")
    String  san;
    /*@Column(name="STATUS_ID")
    String  statusDetail;*/

    @ManyToOne
    @JoinColumn(name="STATUS_ID",referencedColumnName = "STATUS_ID")
    Status  statusCode;

}
