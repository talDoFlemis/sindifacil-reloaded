package com.fightingnerds.sindifacil.domain.exception.ticket;

public class TicketNotFound extends RuntimeException {
    public TicketNotFound(Long id) { super("Ticket not found for id" + id);}
}
