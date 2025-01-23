package com.fightingnerds.sindifacil.models;

import com.fightingnerds.sindifacil.enums.TicketKind;
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

	private TicketKind kind;

	private TicketStatus status;

	@OneToMany
	private List<Attachment> attachments;
}
