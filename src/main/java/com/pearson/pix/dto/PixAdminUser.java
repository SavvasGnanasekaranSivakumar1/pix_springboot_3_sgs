package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ADMIN_USER")
public class PixAdminUser {
    @Id
    @Column(name="USER_ID")
    Long userId;
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
    /*@Column(name="COUNTRY_CODE")
    String  countryDetail;*/
    @ManyToOne
    @JoinColumn(name="COUNTRY_CODE",referencedColumnName = "COUNTRY_CODE")
    Country  countryDetail;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="EMAIL")
    String  email;
    @Column(name="EMAIL_ACTIVITY_FLAG")
    String  emailActivityFlag;
    @Column(name="FAX_1")
    String  fax1;
    @Column(name="FAX_2")
    String  fax2;
    @Column(name="FIRST_NAME")
    String  firstName;
    @Column(name="LAST_LOGIN")
    String  lastLogin;
    @Column(name="LAST_NAME")
    String  lastName;
    @Column(name="LOGIN")
    String  login;
    @Column(name="MOBILE")
    String  mobile;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="MODIFIED_BY")
    String  modifiedBy;
    @Column(name="PASSWORD")
    String  password;
    @Column(name="PASSWORD_EXPIRY")
    String  passwordExpiry;
    @Column(name="PHONE_1")
    String  phone1;
    @Column(name="PHONE_2")
    String  phone2;
    @Column(name="POSTAL_CODE")
    String  postalCode;
    @Column(name="SSOID")
    String  ssoid;
    /*@Column(name="ROLE_TYPE")
    String  roleTypeDetail;*/
    @ManyToOne
    @JoinColumn(name="ROLE_TYPE",referencedColumnName = "ROLE_TYPE")
    PixAdminUserRole  roleTypeDetail;
    @Column(name="STATE")
    String  state;

    @Column(name="WEBSITE")
    String  website;

}
