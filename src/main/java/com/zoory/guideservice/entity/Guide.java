package com.zoory.guideservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Guide {
    @Id
    private String guideId;
    private String name;
    private String address;
    private String age;
    private String gender;
    private String contactNo;

    private byte[] guideIMG;
    private byte[] nicFontIMG;
    private  byte[] nicRearIMG;
    private  byte[] guideIdFontIMG;
    private byte[] guideIdRearIMG;

    private String experience;
    private String manDayValue;
    private String remarks;
}
