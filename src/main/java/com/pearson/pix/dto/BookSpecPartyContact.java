package com.pearson.pix.dto;
import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "PIX_BOOK_SPEC_PARTY_CONTACT")
public class BookSpecPartyContact {

    @Id
    BookSpecPartContactComposite compositeKey;

    @Column(name="CONTACT_FIRST_NAME")
    String  contactFirstName;
    @Column(name="CONTACT_LAST_NAME")
    String  contactLastName;
    @Column(name="CONTACT_NO")
    String  contactNo;
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


}
@Embeddable
class BookSpecPartContactComposite implements Serializable
{
    /*@ManyToOne
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID")
    BookSpecLine  specId;
    @ManyToOne
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    BookSpecLine  specVersion;
    @ManyToOne
    @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    BookSpecLine  specLineNo;*/
    @Column(name="SPEC_ID")
    String  specId;
    @Column(name="SPEC_VERSION")
    String  specVersion;
    @Column(name="SAN")
    String  san;

    @Column(name="ORDER_NO")
    String  orderNo;
}