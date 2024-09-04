package com.pearson.pix.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_CURRENCY")
public class Currency {
    @Id
    @Column(name="CURRENCY_CODE",length = 3)
    String  currencyCode;
    @Column(name="CREATED_BY")
    String  createdBy;
    @Column(name="CREATION_DATE_TIME")
    String  creationDate;

    @Column(name="DESCRIPTION")
    String  description;
    @Column(name="MOD_DATE_TIME")
    String  lastModificationDate;
    @Column(name="MODIFIED_BY")
    String  lastModifiedBy;

}
