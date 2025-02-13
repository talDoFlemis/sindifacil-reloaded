package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.CommentReply;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.CommentReplyEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CommentReplyPersistenceMapper extends PersistenceMapper<CommentReplyEntity, CommentReply> {
}
