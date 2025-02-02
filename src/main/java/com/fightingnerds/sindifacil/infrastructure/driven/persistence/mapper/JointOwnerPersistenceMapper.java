package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.JointOwnerEntity;
import org.mapstruct.Mapper;

@Mapper
public interface JointOwnerPersistenceMapper extends PersistenceMapper<JointOwnerEntity, JointOwner> {
}
