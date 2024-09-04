package com.pearson.pix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_TOLERANCE_LIMIT")
public class PixToleranceLimit {
    @Id
    @Column(name="TOLERANCE_ID")
    Long  toleranceId;
    @Column(name="SAN")
    String  san;
    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
    @Column(name="CREATION_DATE_TIME")
    Date creationDateTime;
    @Column(name="MOD_DATE_TIME")
    Date  modDateTime;
    @Column(name="TOLERANCE_PERCENTAGE")
    Long  tolerancePerc;

}
