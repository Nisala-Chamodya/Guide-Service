package com.zoory.guideservice.service;

import com.zoory.guideservice.dto.request.RequestGuideDTO;

public interface GuideService {
    public void saveGuide(RequestGuideDTO requestGuideDTO);
}
