package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ServiceProviderEntityId {
    
	@Column(name = "service_id")
	private Long serviceId;
	@Column(name = "provider_id")
	private String providerId;
}
