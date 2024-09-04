package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ADMIN_USER_PRIV")
public class PixAdminUserPriv {
    @Id
    @ManyToOne
    @JoinColumn(name="USER_ID",referencedColumnName = "USER_ID")
    PixAdminUser  userDetail;
/*    @Column(name="MODULE_ID")
    String ;
    @Column(name="USER_ID")
    String ;*/
    @Column(name="ACCESS_FLAG")
    String  accessFlag;
    /*@Column(name="CREATED_BY")
    String  createdBy;*/
    @ManyToOne
    @JoinColumn(name="CREATED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    /*@Column(name="MODIFIED_BY")
    String  modifiedBy;*/
    @ManyToOne
    @JoinColumn(name="MODIFIED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  modifiedBy;

    /*@Column(name="MODULE_ID")
    String  moduleDetail;*/
    @ManyToOne
    @JoinColumn(name="MODULE_ID",referencedColumnName = "REF_ID")
    Reference  moduleDetail;
    /*@Column(name="USER_ID")
    String  userDetail;*/


}
