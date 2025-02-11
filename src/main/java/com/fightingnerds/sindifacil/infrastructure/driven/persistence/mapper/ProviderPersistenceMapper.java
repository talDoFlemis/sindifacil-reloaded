package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.provider.Provider;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ProviderEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProviderPersistenceMapper extends PersistenceMapper<ProviderEntity, Provider> {
}
