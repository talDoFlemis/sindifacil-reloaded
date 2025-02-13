package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.CommentAttachment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.CommentAttachmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CommentAttachmentPersistenceMapper extends PersistenceMapper<CommentAttachmentEntity, CommentAttachment> {
}
