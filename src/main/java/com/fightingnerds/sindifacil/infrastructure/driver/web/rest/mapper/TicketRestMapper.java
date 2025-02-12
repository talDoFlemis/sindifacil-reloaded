package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.CreateTicketRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket.TicketResponse;

public interface TicketRestMapper {
    Ticket toDomain(CreateTicketRequest createTicketRequest);
    TicketResponse toCreateTicketResponse(Ticket ticket);
}
