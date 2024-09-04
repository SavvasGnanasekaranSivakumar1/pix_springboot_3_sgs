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
@Table(name="PIX_PLANNING_PARTY_CONTACT")
public class PixPlanningPartyContact {
/*    @Column(name="ORDER_NO")
    String ;
    @Column(name="PLAN_ID")
    String ;
    @Column(name="PLAN_VERSION")
    String ;
    @Column(name="SAN")
    String ;*/
    @Column(name="CONTACT_FIRST_NAME")
    String  contactFirstName;
    @Column(name="CONTACT_LAST_NAME")
    String  contactLastName;
    @Column(name="CONTACT_NO")
    String  contactNo;
    @Column(name="CONTACT_TYPE")
    String  contactType;
    @Column(name="EMAIL")
    String  email;
    @Column(name="FAX")
    String  fax;
    @Column(name="MOBILE")
    String  mobile;
    @Column(name="ORDER_NO")
    String  orderNo;
    @Column(name="PHONE")
    String  phone;
    @Column(name="PLAN_ID")
    String  planId;
    @Column(name="PLAN_VERSION")
    String  planVersion;
    @Column(name="SAN")
    String  san;

}
