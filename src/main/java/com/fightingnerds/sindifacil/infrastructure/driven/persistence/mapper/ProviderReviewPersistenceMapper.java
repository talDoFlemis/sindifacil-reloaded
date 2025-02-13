package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.provider.ProviderReview;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ProviderReviewEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProviderReviewPersistenceMapper extends PersistenceMapper<ProviderReviewEntity, ProviderReview> {
}
