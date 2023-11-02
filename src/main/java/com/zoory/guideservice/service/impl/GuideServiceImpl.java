package com.zoory.guideservice.service.impl;

import com.zoory.guideservice.dto.request.RequestGuideDTO;
import com.zoory.guideservice.entity.Guide;
import com.zoory.guideservice.repo.GuideRepo;
import com.zoory.guideservice.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GuideServiceImpl implements GuideService {
    @Autowired
    private GuideRepo guideRepo;
    @Override
    public void saveGuide(RequestGuideDTO requestGuideDTO) {
        UUID uuid = UUID.randomUUID();
        long id = uuid.getMostSignificantBits();

        Guide guide=new Guide(
                id,requestGuideDTO.getName(),requestGuideDTO.getAddress(),requestGuideDTO.getAge(),
                requestGuideDTO.getGender(),requestGuideDTO.getContactNo(),requestGuideDTO.getGuideIMG(),
                requestGuideDTO.getNicFontIMG(),requestGuideDTO.getNicRearIMG(),requestGuideDTO.getGuideIdFontIMG(),
                requestGuideDTO.getGuideIdRearIMG(),requestGuideDTO.getExperience(),requestGuideDTO.getManDayValue(),
                requestGuideDTO.getRemarks()
        );
        guideRepo.save(guide);
    }

    @Override
    public Guide updateGuide(Long id, RequestGuideDTO requestGuideDTO) {
       Guide guideVar=guideRepo.findById(id).get();
       guideVar.setName(requestGuideDTO.getName());
        guideVar.setAddress(requestGuideDTO.getAddress());
        guideVar.setAge(requestGuideDTO.getAge());
        guideVar.setGender(requestGuideDTO.getGender());
        guideVar.setContactNo(requestGuideDTO.getContactNo());

        guideVar.setGuideIMG(requestGuideDTO.getGuideIMG());
        guideVar.setNicFontIMG(requestGuideDTO.getNicFontIMG());
        guideVar.setNicRearIMG(requestGuideDTO.getNicRearIMG());
        guideVar.setGuideIdFontIMG(requestGuideDTO.getGuideIdFontIMG());
        guideVar.setGuideIdRearIMG(requestGuideDTO.getGuideIdRearIMG());

        guideVar.setExperience(requestGuideDTO.getExperience());
        guideVar.setManDayValue(requestGuideDTO.getManDayValue());
        guideVar.setRemarks(requestGuideDTO.getRemarks());

        guideRepo.save(guideVar);
        return guideVar;
    }
}
