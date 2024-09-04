package com.pearson.pix.dto;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_BOOK_SPEC_PARTY")
public class BookSpecParty {
    @Id
    BookSpecPartyComposite compositeKey;

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


    @Column(name="STATE")
    String  state;
    @Column(name="URL")
    String  url;
}
@Embeddable
class BookSpecPartyComposite implements Serializable {

    @Column(name="SAN")
    String  san;
    /*@ManyToOne
    @JoinColumn(name = "SPEC_ID", referencedColumnName = "SPEC_ID")
    BookSpec specId;
    @ManyToOne
    @JoinColumn(name = "SPEC_VERSION", referencedColumnName = "SPEC_VERSION")
    BookSpec specVersion;*/
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "SPEC_ID", referencedColumnName = "SPEC_ID"),
            @JoinColumn(name = "SPEC_VERSION", referencedColumnName = "SPEC_VERSION")
    })
    BookSpec spec;
}