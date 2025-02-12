package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.ticket.TicketStorer;
import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.enums.TicketStatus;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.TicketEntity;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.TicketJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.TicketPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class TicketStorerImpl implements TicketStorer {
    private final TicketJpaRepository ticketJpaRepository;
    private final TicketPersistenceMapper ticketPersistenceMapper;

    @Override
    public Ticket store(Ticket data) {
        try {
            TicketEntity ticket = ticketPersistenceMapper.toEntity(data);
            ticket = ticketJpaRepository.save(ticket);
            return ticketPersistenceMapper.toDomain(ticket);
        } catch (Exception e) {
            log.error("Error storing ticket: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public Optional<Ticket> getById(Long id) {
        return ticketJpaRepository.findById(id)
                .map(ticketPersistenceMapper::toDomain);
    }

    @Override
    public List<Ticket> getAllTicketByStatus(TicketStatus ticketStatus) {
        return null;
    }

    @Override
    public Ticket update(Ticket ticket) {
        return null;
    }
}
