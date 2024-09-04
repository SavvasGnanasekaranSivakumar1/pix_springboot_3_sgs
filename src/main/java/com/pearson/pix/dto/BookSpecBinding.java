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
@Table(name = "PIX_BOOK_SPEC_BINDING")
public class BookSpecBinding {
    @Id
    BookSpecBindingComposite compositeKeys;

    @Column(name="BACK_STYLE_TYPE")
    String  backStyleType;
    @Column(name="BINDING_EXTRA_QUANTITY")
    String  bindingExtraQuantity;
    @Column(name="BLOCK_EDGE_FINISH")
    String  blockEdgeFinish;
    @Column(name="CASE_DECORATION_HITS")
    String  caseDecorationHits;
    @Column(name="CASE_DECORATION_TYPE")
    String  caseDecorationType;
    @Column(name="COVER_SCORING")
    String  coverScoring;
    @Column(name="END_SHEET_DESC")
    String  endSheetDesc;
    @Column(name="HOLEPUNCH_EDGE_DISTANCE")
    String  holepunchEdgeDistance;
    @Column(name="HOLE_PUNCH_INFO")
    String  holePunchInfo;
    @Column(name="HOLEPUNCH_SIZE")
    String  holepunchSize;
    @Column(name="HOLE_PUNCH_TYPE")
    String  holePunchType;
    @Column(name="PERFO_EDGE_DISTANCE")
    String  perfoEdgeDistance;
    @Column(name="PERFO_TYPE")
    String  perfoType;
    @Column(name="REINFORCEMENT")
    String  reinforcement;

    @Column(name="STYLE_TYPE")
    String  styleType;
    @Column(name="WIRE_GAUGE")
    String  wireGauge;
}
@Embeddable
class BookSpecBindingComposite implements Serializable
{
    /*@ManyToOne
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID")
    BookSpecLine specId;

    @ManyToOne
    @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO")
    BookSpecLine specVersion;

    @ManyToOne
    @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    BookSpecLine specLineNo;*/
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="SPEC_ID",referencedColumnName = "SPEC_ID"),
            @JoinColumn(name="SPEC_LINE_NO",referencedColumnName = "SPEC_LINE_NO"),
            @JoinColumn(name="SPEC_VERSION",referencedColumnName = "SPEC_VERSION")
    })
    BookSpecLine specLine;
}