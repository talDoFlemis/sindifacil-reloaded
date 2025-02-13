package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ticket_attachments")
public class TicketAttachmentEntity extends AttachmentEntity {
	@ManyToOne
	@JoinColumn(name = "ticket_id", nullable = false)
	private TicketEntity ticket;
}
