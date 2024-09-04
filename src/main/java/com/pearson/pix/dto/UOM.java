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
@Table(name = "PIX_UOM_CODE")
public class UOM {
    @Id
    @Column(name="UOM_ID")
    Long  uomId;

    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="UOM")
    String  uom;

}
