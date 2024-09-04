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
@Table(name = "PIX_COUNTRY_CODE")
public class Country {
    @Id
    @Column(name="COUNTRY_CODE",length = 3)
    String  countryCode;
    @Column(name="COUNTRY_NAME")
    String  countryName;

}
