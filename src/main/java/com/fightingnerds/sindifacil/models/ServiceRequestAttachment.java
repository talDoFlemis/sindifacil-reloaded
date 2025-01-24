package com.fightingnerds.sindifacil.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceRequestAttachment extends Attachment {
	@ManyToOne(fetch = FetchType.LAZY)
	private ServiceRequest serviceRequest;
}
