package com.zoory.guideservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Guide {
    @Id
    private Long guideId;
    private String name;
    private String address;
    private String age;
    private String gender;
    private String contactNo;


    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 655555555)

    private byte[] guideIMG;
    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 65555)
    private byte[] nicFontIMG;
    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 65555)

    private  byte[] nicRearIMG;
    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 65555)

    private  byte[] guideIdFontIMG;
    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 65555)

    private byte[] guideIdRearIMG;

    private String experience;
    private String manDayValue;
    private String remarks;
}
