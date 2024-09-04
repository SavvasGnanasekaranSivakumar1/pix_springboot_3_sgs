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
@Table(name="PIX_ADMIN_USER_PARTY")
public class PixAdminUserParty {
    @Id
    PixAdminUserPartyComposite composite;

   /* @Column(name="CREATED_BY")
    String  createdBy;*/
    @ManyToOne
    @JoinColumn(name="CREATED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
   /* @Column(name="MODIFIED_BY")
    String  modifiedBy;*/
   @ManyToOne
   @JoinColumn(name="MODIFIED_BY",referencedColumnName = "USER_ID")
   PixAdminUser  modifiedBy;
  /*  @Column(name="SAN")
    String  san;
    @Column(name="USER_ID")
    String  userId;*/
}
@Embeddable
class PixAdminUserPartyComposite implements Serializable
{
    @ManyToOne
    @JoinColumn(name="USER_ID",referencedColumnName = "USER_ID")
    PixAdminUser  adiminUser;

    @ManyToOne
    @JoinColumn(name="SAN",referencedColumnName = "SAN")
    PixAdminParty san;
}