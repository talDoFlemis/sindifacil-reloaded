package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.CreateTicketRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket.TicketResponse;
import org.mapstruct.Mapper;

@Mapper
public interface TicketRestMapper {
    Ticket toDomain(CreateTicketRequest createTicketRequest);
    TicketResponse toCreateTicketResponse(Ticket ticket);
}
