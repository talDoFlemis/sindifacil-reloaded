package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.ticket.TicketAttachmentStorer;
import com.fightingnerds.sindifacil.domain.model.ticket.TicketAttachment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.TicketAttachmentJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.TicketAttachmentPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketAttachmentStorerImpl implements TicketAttachmentStorer {
	private final TicketAttachmentJpaRepository ticketAttachmentJpaRepository;
	private final TicketAttachmentPersistenceMapper ticketAttachmentPersistenceMapper;

	@Override
	public TicketAttachment store(TicketAttachment data) {
		return null;
	}

	@Override
	public Optional<TicketAttachment> getById(Long id) {
		return Optional.empty();
	}
}
