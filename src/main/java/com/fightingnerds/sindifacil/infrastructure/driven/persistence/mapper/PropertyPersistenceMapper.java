package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.property.Property;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.PropertyEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PropertyPersistenceMapper extends PersistenceMapper<PropertyEntity, Property> {
}
