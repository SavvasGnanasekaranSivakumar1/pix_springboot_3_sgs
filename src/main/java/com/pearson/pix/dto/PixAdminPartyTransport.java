package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ADMIN_PARTY_TRANSPORT")
public class PixAdminPartyTransport
{
    @Id
    @ManyToOne
    @JoinColumn(name="SAN",referencedColumnName = "SAN")
    PixAdminParty san;
 /*   @Column(name="ACCESS_METHOD_ID")
    String  accessMethodDetail;*/
    @ManyToOne
    @JoinColumn(name="ACCESS_METHOD_ID",referencedColumnName = "REF_ID")
    Reference  productTypeDetail;
    @ManyToOne
    @JoinColumn(name="CREATED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="GET_FOLDER")
    String  folder;
    @Column(name="LOGIN")
    String  login;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @ManyToOne
    @JoinColumn(name="MODIFIED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  modifiedBy;

    @Column(name="PASSWORD")
    String  password;
    @Column(name="PUT_FOLDER")
    String  putFolder;

    @Column(name="SERVER_NAME")
    String  serverName;

}
