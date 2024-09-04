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
@Table(name="PIX_ETL_BOOK_SPEC_BINDING_CES")
public class PixEtlBookSpecBindingCes {
    @Id
    PixEtlBookSpecBindingCesComposite composite;

    @Column(name="BACK_STYLE_TYPE")
    String  backStyleType;
    @Column(name="BINDINGEXTRAQTY")
    String  bindingextraqty;
    @Column(name="BINDING_PER_FO_EDGE_DISTANCE")
    String  bindingPerFoEdgeDistance;
    @Column(name="BINDING_PER_FO_TYPE")
    String  bindingPerFoType;
    @Column(name="BIND_STYLE")
    String  bindStyle;
    @Column(name="BLOCK_EDGE_FINISH")
    String  blockEdgeFinish;
    @Column(name="CASE_DECORATION_HITS")
    String  caseDecorationHits;
    @Column(name="CASE_DECORATION_TYPE")
    String  caseDecorationType;
    @Column(name="COVER_SCORING")
    String  coverScoring;
    @Column(name="END_SHEET_DESCR")
    String  endSheetDescr;
    @Column(name="EVENT_LOG_DATE")
    String  eventLogDate;
    @Column(name="HOLE_PUNCH_EDGE_DISTANCE")
    String  holePunchEdgeDistance;
    @Column(name="HOLE_PUNCH_INFO")
    String  holePunchInfo;
    @Column(name="HOLE_PUNCH_SIZE")
    String  holePunchSize;
    @Column(name="HOLE_PUNCH_TYPE")
    String  holePunchType;
    @Column(name="TRANSACTION_NUMBER")
    String  pixEtlBookSpecLineCes;

    @Column(name="PIX_TRANSACTION_DATE")
    String  pixTransactionDate;
    @Column(name="REINFORCEMENT")
    String  reinforcement;
    @Column(name="WIRE_GAUGE")
    String  wireGauge;

}
@Embeddable
class PixEtlBookSpecBindingCesComposite implements Serializable
{
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="COMPONENT_ID",referencedColumnName = "COMPONENT_ID"),
            @JoinColumn(name="COMPONENT_SEQ_NUMBER",referencedColumnName = "COMPONENT_SEQ_NUMBER"),
            @JoinColumn(name="TRANSACTION_NUMBER",referencedColumnName = "TRANSACTION_NUMBER")
    })
    PixEtlBookSpecLineCes  specLineCes;
}