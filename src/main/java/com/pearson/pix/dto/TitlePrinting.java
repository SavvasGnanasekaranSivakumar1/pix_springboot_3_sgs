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
@Table(name = "PIX_TITLE_PRINTING")
public class TitlePrinting
{
    @Id
    @Column(name="TITLE_ID")
    Long titleId;

    @Column(name="ACTIVE_FLAG")
    String  activeFlag;
    @Column(name="BASIS_WT")
    String  basisWeight;
    @Column(name="CREATION_DATE_TIME")
    String  creationDateTime;
    @Column(name="ISBN10")
    String  isbn10;
    @Column(name="ISBN13")
    String  isbn13;
    @Column(name="MOD_DATE_TIME")
    String  modDateTime;
    @Column(name="PAPER_GRADE")
    String  paperGrade;
    @Column(name="PRINT_NO")
    String  printNo;
    @Column(name="ROLL_SIZE")
    String  rollSize;

    @Column(name="TITLE_TYPE")
    String  titleType;

}
