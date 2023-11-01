package com.zoory.guideservice.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestGuideDTO {
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
