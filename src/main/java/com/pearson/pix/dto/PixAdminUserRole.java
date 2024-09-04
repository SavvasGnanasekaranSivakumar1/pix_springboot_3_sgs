package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="PIX_ADMIN_USER_ROLE")
public class PixAdminUserRole {

    @Id
    @Column(name="ROLE_TYPE")
    String  roleType;
    /*@Column(name="CREATED_BY")
    String  createdBy;*/
    @ManyToOne
    @JoinColumn(name="CREATED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="DESCRIPTION")
    String  description;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    /*@Column(name="MODIFIED_BY")
    String  modifiedBy;*/
    @ManyToOne
    @JoinColumn(name="MODIFIED_BY",referencedColumnName = "USER_ID")
    PixAdminUser  modifiedBy;

}
