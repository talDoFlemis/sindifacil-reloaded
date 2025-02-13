package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "service_provider")
public class ServiceProviderEntityId {
    
	@Column(name = "service_id")
	private Long serviceId;
	@Column(name = "provider_id")
	private String providerId;
}
