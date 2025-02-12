package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.TicketEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TicketPersistenceMapper extends PersistenceMapper<TicketEntity, Ticket> {
}
