package com.zoory.guideservice.repo;

import com.zoory.guideservice.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideRepo extends JpaRepository<Guide,Long> {
}
