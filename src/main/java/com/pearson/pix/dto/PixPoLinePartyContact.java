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
@Table(name="PIX_PO_LINE_PARTY_CONTACT")
public class PixPoLinePartyContact {
    @Id
    PixPoLinePartyContactComposite composite;
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
    @Column(name="PHONE")
    String  phone;
    /*@Column(name="PO_ID")
    String  poId;
    @Column(name="PO_LINE_NO")
    String  poLineNo;
    @Column(name="PO_VERSION")
    String  poVersion;
    @Column(name="SAN")
    String  san;*/

}
class PixPoLinePartyContactComposite implements Serializable
{
    @Column(name="CONTACT_NO")
    Long  contactNo;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PO_ID", referencedColumnName = "PO_ID"),
            @JoinColumn(name = "PO_VERSION", referencedColumnName = "PO_VERSION"),
            @JoinColumn(name = "PO_LINE_NO", referencedColumnName = "PO_LINE_NO"),
            @JoinColumn(name = "SAN", referencedColumnName = "SAN")
    })
    PixPoLine poLine;
}
