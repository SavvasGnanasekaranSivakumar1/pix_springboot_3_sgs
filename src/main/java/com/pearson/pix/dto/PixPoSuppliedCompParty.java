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
@Table(name="PIX_PO_SUPPLIED_COMP_PARTY")
public class PixPoSuppliedCompParty {

    @Id
    PixPoSuppCompPartyComposite composite ;

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

    @Column(name="POSTAL_CODE")
    String  postalCode;

    @Column(name="SAN")
    String  san;
    @Column(name="STATE")
    String  state;

    @Column(name="URL")
    String  url;

}
@Embeddable
class PixPoSuppCompPartyComposite implements Serializable
{

 @ManyToOne
 @JoinColumns({
         @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
         @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION"),
         @JoinColumn(name = "PO_LINE_NO", referencedColumnName = "PO_LINE_NO"),
         @JoinColumn(name = "SUPP_COMP_LINE_NO", referencedColumnName = "SUPP_COMP_LINE_NO")
 })
 PixPoSuppliedComp suppliedComp;

}
