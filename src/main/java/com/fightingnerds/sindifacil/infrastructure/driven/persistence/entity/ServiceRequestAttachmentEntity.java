package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "service_request_attachments")
public class ServiceRequestAttachmentEntity extends AttachmentEntity {
	@ManyToOne
	@JoinColumn(name = "service_request_id", nullable = false)
	private ServiceRequestEntity serviceRequest;
}
