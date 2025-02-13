package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import org.mapstruct.Mapper;

import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.NewsletterEntity;

@Mapper
public interface NewsletterPersistenceMapper extends PersistenceMapper<NewsletterEntity, Newsletter> {
}
