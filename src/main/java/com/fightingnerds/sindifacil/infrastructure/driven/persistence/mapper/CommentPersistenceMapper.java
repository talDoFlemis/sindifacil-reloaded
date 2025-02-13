package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.Comment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.CommentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CommentPersistenceMapper extends PersistenceMapper<CommentEntity, Comment> {
}
