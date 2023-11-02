package com.zoory.guideservice.service;

import com.zoory.guideservice.dto.request.RequestGuideDTO;
import com.zoory.guideservice.entity.Guide;

public interface GuideService {
    public void saveGuide(RequestGuideDTO requestGuideDTO);
    public Guide updateGuide(Long id ,RequestGuideDTO requestGuideDTOGuide);
}
