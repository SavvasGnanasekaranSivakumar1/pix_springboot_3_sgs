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
@Table(name="PIX_PRICE_DETAIL")
public class PixPriceDetail {

    @Id
    PixPriceDetailComposite composite;

    /*@Column(name="CURRENCY_CODE")
    String  currencyDetail;*/
    @ManyToOne
    @JoinColumn(name="CURRENCY_CODE",referencedColumnName = "CURRENCY_CODE")
    Currency  currencyDetail;

    @Column(name="GL_DESC")
    String  glDesc;

    @Column(name="PRICE")
    String  price;

}
@Embeddable
class PixPriceDetailComposite implements Serializable
{
    @Column(name="GL_CODE")
    String  glCode;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
            @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION"),
            @JoinColumn(name = "PO_LINE_NO", referencedColumnName = "PO_LINE_NO")
    })
    PixPoLine poLine;
}