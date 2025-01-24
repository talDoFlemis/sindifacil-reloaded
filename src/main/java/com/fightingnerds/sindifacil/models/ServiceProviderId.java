package com.fightingnerds.sindifacil.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class ServiceProviderId implements Serializable {
	@Column(name = "service_id")
	private Long serviceId;
	@Column(name = "provider_id")
	private String providerId;
}
