package com.zoory.guideservice.api;

import com.zoory.guideservice.dto.request.RequestGuideDTO;
import com.zoory.guideservice.entity.Guide;
import com.zoory.guideservice.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/guides")
public class GuideController {
    @Autowired
    private GuideService guideService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void  addGuide(@RequestPart String name,
                          @RequestPart String address,
                          @RequestPart String age,
                          @RequestPart String gender,
                          @RequestPart String contactNo,
                          @RequestPart byte[] guideIMG,
                          @RequestPart byte[] nicFontIMG,
                          @RequestPart byte[] nicRearIMG,
                          @RequestPart byte[] guideIdFontIMG,
                          @RequestPart byte[] guideIdRearIMG,
                          @RequestPart String experience,
                          @RequestPart String manDayValue,
                          @RequestPart String remarks
    ){

        RequestGuideDTO requestGuideDTO=new RequestGuideDTO(name,address,age,gender,contactNo,guideIMG,nicFontIMG,
                nicRearIMG,guideIdFontIMG,guideIdRearIMG,experience,manDayValue,remarks);
        guideService.saveGuide(requestGuideDTO);
        System.out.println(requestGuideDTO);
    }
    @PutMapping("/{id}")
    public Guide updateGuide(@PathVariable long id,
                             @RequestPart String name,
                             @RequestPart String address,
                             @RequestPart String age,
                             @RequestPart String gender,
                             @RequestPart String contactNo,
                             @RequestPart byte[] guideIMG,
                             @RequestPart byte[] nicFontIMG,
                             @RequestPart byte[] nicRearIMG,
                             @RequestPart byte[] guideIdFontIMG,
                             @RequestPart byte[] guideIdRearIMG,
                             @RequestPart String experience,
                             @RequestPart String manDayValue,
                             @RequestPart String remarks


                             ){
        RequestGuideDTO requestGuideDTO=new RequestGuideDTO(
          name,address,age,gender,contactNo,guideIMG,nicFontIMG,nicRearIMG,guideIdFontIMG,guideIdRearIMG,experience,
          manDayValue,remarks
        );

        return guideService.updateGuide(id,requestGuideDTO);
    }
}
