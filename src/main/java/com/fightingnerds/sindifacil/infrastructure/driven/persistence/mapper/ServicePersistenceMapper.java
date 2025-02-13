package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.service.Service;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ServicePersistenceMapper extends PersistenceMapper<ServiceEntity, Service> {
}
