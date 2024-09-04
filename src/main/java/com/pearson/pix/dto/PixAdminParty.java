package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ADMIN_PARTY")
public class PixAdminParty {
    @Id
    @Column(name="SAN")
    Long san;
    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
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
    @Column(name="CONTACT_FIRST_NAME")
    String  contactFirstName;
    @Column(name="CONTACT_LAST_NAME")
    String  contactLastName;
    @ManyToOne
    @JoinColumn(name="COUNTRY_CODE",referencedColumnName = "COUNTRY_CODE")
    Country  countryDetail;
    /*@Column(name="CREATED_BY")
    String  createdBy;*/
    @ManyToOne
    @JoinColumn(name="CREATED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="EMAIL")
    String  email;
    @Column(name="FAX_1")
    String  fax1;
    @Column(name="FAX_2")
    String  fax2;
    @Column(name="MOBILE")
    String  mobile;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @ManyToOne
    @JoinColumn(name="MODIFIED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  modifiedBy;

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
    @Column(name="PHONE_1")
    String  phone1;
    @Column(name="PHONE_2")
    String  phone2;
    @Column(name="POSTAL_CODE")
    String  postalCode;

    @Column(name="STATE")
    String  state;
    @Column(name="WEBSITE")
    String  website;

}
