package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class TicketAttachment extends Attachment {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ticket_id", nullable = false)
	private Ticket ticket;
}
