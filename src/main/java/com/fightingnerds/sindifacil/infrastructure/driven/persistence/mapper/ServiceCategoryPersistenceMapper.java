package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceCategoryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceCategoryPersistenceMapper extends PersistenceMapper<ServiceCategoryEntity, ServiceCategory> {
}
