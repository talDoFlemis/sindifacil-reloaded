package com.fightingnerds.sindifacil.application.port.driver.ticket;

import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.enums.TicketStatus;

import java.util.List;

public interface GetAllTicketsByStatusUseCase {
    List<Ticket> getAllTicketByStatus(TicketStatus ticketStatus);
}
