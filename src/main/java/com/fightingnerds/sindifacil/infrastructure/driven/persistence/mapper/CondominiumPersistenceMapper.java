package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.CondominiumEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CondominiumPersistenceMapper extends PersistenceMapper<CondominiumEntity, Condominium> {
}
