package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.provider.ProviderReview;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.provider.CreateProviderReviewRequest;
import org.mapstruct.Mapper;

@Mapper
public interface ProviderReviewRestMapper {
	ProviderReview toDomain(CreateProviderReviewRequest createProviderReviewRequest);
}
