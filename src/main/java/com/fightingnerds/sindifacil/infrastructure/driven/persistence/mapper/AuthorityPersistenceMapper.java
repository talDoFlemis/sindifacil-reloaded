package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.user.Authority;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.AuthorityEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AuthorityPersistenceMapper extends PersistenceMapper<AuthorityEntity, Authority> {
}
