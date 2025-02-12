package com.fightingnerds.sindifacil.application.port.driven.ticket;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.enums.TicketStatus;

import java.util.List;
import java.util.UUID;

public interface TicketStorer extends Storer<Ticket, Long> {
    List<Ticket> getAllTicketByStatus(TicketStatus ticketStatus);

    Ticket update(Ticket ticket);
}
