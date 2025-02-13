package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import org.mapstruct.Mapper;

import com.fightingnerds.sindifacil.domain.model.service.ServiceProvider;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceProviderEntity;

@Mapper
public interface ServiceProviderPersistenceMapper extends PersistenceMapper<ServiceProviderEntity, ServiceProvider> {
}
