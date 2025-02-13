package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.TicketAttachment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.TicketAttachmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TicketAttachmentPersistenceMapper extends PersistenceMapper<TicketAttachmentEntity, TicketAttachment> {
}
