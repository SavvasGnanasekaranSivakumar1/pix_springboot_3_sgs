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
@Table(name="PIX_PO_LINE_PARTY")
public class PixPoLineParty {
    @Id
    PixPOLinePartyComposite composite;

    @Column(name="ACKNOWLEDGE_FLAG")
    String  acknowledgeFlag;
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
    /*@Column(name="COUNTRY_CODE")
    String  countryDetail;*/
    @ManyToOne
    @JoinColumn(name="COUNTRY_CODE",referencedColumnName = "COUNTRY_CODE")
    Country  countryDetail;
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
    @Column(name="PARTY_TYPE")
    String  partyType;
  /*  @Column(name="PO_ID")
    String  poId;
    @Column(name="PO_LINE_NO")
    String  poLineNo;*/
    @Column(name="POSTAL_CODE")
    String  postalCode;
   /* @Column(name="PO_VERSION")
    String  poVersion;*/

    @Column(name="STATE")
    String  state;
    @Column(name="URL")
    String  url;

}
class PixPOLinePartyComposite implements Serializable
{
    @Column(name="SAN")
    String  san;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
            @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION"),
            @JoinColumn(name = "PO_LINE_NO", referencedColumnName = "PO_LINE_NO")
    })
    PixPoLine poLine;
}