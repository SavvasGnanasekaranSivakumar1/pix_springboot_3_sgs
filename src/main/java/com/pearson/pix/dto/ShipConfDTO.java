package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ETL_ASN")
public class ShipConfDTO
{
    @Id
    ShipConfComposite composite;

    @Column(name="PO_NO")
    String  poNumber;
    @Column(name="BK_NUMBER")
    String  bkNumber;
    @Column(name="ISBN10")
    String  isbn10;
    @Column(name="TRACKING_NUMBER")
    String  trackingNumber;
    @Column(name="CARRIER_LEVEL")
    String  carrierLevel;
    @Column(name="SHIP_TO")
    String  shipTo;
    @Column(name="SHIP_DATE")
    String  shipDate;
    @Column(name="GROSS_WEIGHT")
    String  grossWeight;
    @Column(name="UNITS_PER_CARTON")
    String  totalUnits;
    @Column(name="TOTAL_CARTONS_SHIPPED")
    String  totalCartons;
    @Column(name="DESK_COPY")
    String  deskCopy;
    @Column(name="PROCESSING_FLAG")
    String  processingFlag;
    @Column(name="ERROR_DESCRIPTION")
    String  errorDesc;
    @Column(name="CREATION_DATE_TIME")
    String  creationDate;
    @Column(name="MOD_DATE_TIME")
    String  modDate;

}
@Embeddable
class ShipConfComposite implements Serializable
{
 @Column(name="USER_ID")
 Long  userId;
 @Column(name="SESSION_ID")
 Long  sessionId;
 @Column(name="ROW_ID")
 Long  rowId;
}