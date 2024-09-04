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
@Table(name="PIX_PLANNING_PARTY")
public class PixPlanningParty {
    /*@Column(name="PLAN_ID")
    String ;
    @Column(name="PLAN_VERSION")
    String ;
    @Column(name="SAN")
    String ;*/
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
    @Column(name="COUNTRY_CODE")
    String  countryDetail;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="FINISHED_VENDOR_FLAG")
    String  finishedVendorFlag;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="MODIFIED_BY")
    String  modifiedBy;
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
    @Column(name="PLAN_ID")
    String  planId;
    @Column(name="PLAN_VERSION")
    String  planVersion;
    @Column(name="POSTAL_CODE")
    String  postalCode;
    @Column(name="SAN")
    String  san;
    @Column(name="STATE")
    String  state;
    @Column(name="URL")
    String  url;

}
