package com.fightingnerds.sindifacil.application.port.driver.ticket;

import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;

import java.util.List;

public interface GetAllTickets {
    List<Ticket> getAll();
}
