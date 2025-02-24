package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import com.fightingnerds.sindifacil.domain.model.provider.Provider;
import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "service_requests")
public class ServiceRequestEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_provider_id", nullable = false)
	private ProviderEntity provider;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ticket_id", nullable = false)
	private TicketEntity ticket;

	@Column(name = "hours_worked")
	private Long hoursWorked;

	@Column(name = "started_at", columnDefinition = "timestamp with time zone not null", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date startedAt;

	@Column(name = "finished_at", columnDefinition = "timestamp with time zone not null")
	@Temporal(TemporalType.TIMESTAMP)
	private Date finishedAt;

	@OneToMany(
		mappedBy = "service_request_id",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<ServiceRequestAttachmentEntity> attachments;
}
