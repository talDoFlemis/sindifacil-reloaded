package com.fightingnerds.sindifacil.domain.model;

import com.fightingnerds.sindifacil.enums.TicketStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "creator_id", nullable = false)
	private User creator;

	private String title;

	private String description;

	@OneToMany
	private List<Comment> comments;

	private TicketStatus status;

	@OneToMany(
		mappedBy = "ticket_id",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<TicketAttachment> attachments;
}
