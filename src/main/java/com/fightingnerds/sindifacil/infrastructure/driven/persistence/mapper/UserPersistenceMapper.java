package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.user.User;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserPersistenceMapper extends PersistenceMapper<UserEntity, User> {
}
