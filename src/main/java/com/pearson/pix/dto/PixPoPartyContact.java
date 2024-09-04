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
@Table(name="PIX_PO_PARTY_CONTACT")
public class PixPoPartyContact {

    @Id
    PixPOPartyContactComposite composite;
    @Column(name="CONTACT_FIRST_NAME")
    String  contactFirstName;
    @Column(name="CONTACT_LAST_NAME")
    String  contactLastName;

    @Column(name="CONTACT_TYPE")
    String  contactType;
    @Column(name="EMAIL")
    String  email;
    @Column(name="FAX")
    String  fax;
    @Column(name="MOBILE")
    String  mobile;
    @Column(name="ORDER_NO")
    String  orderNo;
    /*@Column(name="PARTY_LINE_NO")
    String  partyLineNo;*/
    @Column(name="PHONE")
    String  phone;


}
@Embeddable
class PixPOPartyContactComposite implements Serializable {
    @Column(name="CONTACT_NO")
    Long  contactNo;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
            @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION"),
            @JoinColumn(name = "PARTY_LINE_NO", referencedColumnName = "PARTY_LINE_NO")
    })
    PixPoParty poParty;
}