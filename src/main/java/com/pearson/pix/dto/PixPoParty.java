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
@Table(name="PIX_PO_PARTY")
public class PixPoParty {
    @Id
    PixPOPartyComposite composite;

    @Column(name="ADDRESS_1")
    String  address1;
    @Column(name="ADDRESS_2")
    String  address2;
    @Column(name="ADDRESS_3")
    String  address3;
    @Column(name="ADDRESS_4")
    String  address4;
    @Column(name="CITY")
    String  city;
    @Column(name="COMMENTS")
    String  comments;
    @Column(name="COMMENTS1")
    String  comments1;
    @Column(name="VENDOR_PLANT_CODE")
    String  vendorPlantCode;
   /* @Column(name="COUNTRY_CODE")
    String  countryDetail;*/
   @ManyToOne
   @JoinColumn(name="COUNTRY_CODE",referencedColumnName = "COUNTRY_CODE")
   Country  countryDetail;
    @Column(name="DELIVERY_DATE")
    String  deliveryDate;
    @Column(name="FINISHED_VENDOR_FLAG")
    String  finishedVendorFlag;
    @Column(name="NAME_1")
    String  name1;
    @Column(name="NAME_2")
    String  name2;
    @Column(name="NAME_3")
    String  name3;
    @Column(name="ORG_UNIT_CODE")
    String  orgUnitCode;
    @Column(name="ORG_UNIT_NAME")
    String  orgUnitName;
    @Column(name="PARTY_ABBR")
    String  partyAbbr;
    @Column(name="PARTY_LINE_NO")
    String  partyLineNo;
    @Column(name="PARTY_TYPE")
    String  partyType;

    @Column(name="POSTAL_CODE")
    String  postalCode;

    @Column(name="SAN")
    String  san;
    @Column(name="STATE")
    String  state;
   /* @Column(name="STATUS_ID")
    String  statusId;*/
   @ManyToOne
   @JoinColumn(name="STATUS_ID",referencedColumnName = "STATUS_ID")
   Status  statusId;
    @Column(name="URL")
    String  url;

}
@Embeddable
class PixPOPartyComposite implements Serializable
{
    @Column(name="PO_ID")
    Long  poId;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
            @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION")
    })
    PixPoHeader header;
}