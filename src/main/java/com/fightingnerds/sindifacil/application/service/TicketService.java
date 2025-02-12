package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.ticket.TicketStorer;
import com.fightingnerds.sindifacil.application.port.driver.ticket.*;
import com.fightingnerds.sindifacil.domain.exception.ticket.TicketNotFound;
import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.enums.TicketStatus;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService implements CreateTicketUseCase, GetAllTicketsByStatusUseCase, UpdateTicketUseCase, GetAllTickets, GetTicketUseCase {
    private final TicketStorer ticketStorer;

    @Override
    public Ticket create(@Valid Ticket ticket) {
        log.debug("Creating ticket: {}", ticket);

        ticket =  ticketStorer.store(ticket);

        log.info("Ticket created: {}", ticket);
        return ticket;
    }

    @Override
    public List<Ticket> getAllTicketByStatus(TicketStatus ticketStatus) {
        return ticketStorer.getAllTicketByStatus(ticketStatus);
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return null;
    }

    @Override
    public List<Ticket> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Ticket getTicket(Long id) {
        return ticketStorer.getById(id).orElseThrow(() -> {
            log.info("Address not found id: {}", id);
            return new TicketNotFound(id);
        });
    }
}
