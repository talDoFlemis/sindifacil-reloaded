package com.fightingnerds.sindifacil.application.port.driver.ticket;

import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;

public interface GetTicketUseCase {
    Ticket getTicket(Long id);
}
