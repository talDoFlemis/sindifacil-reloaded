package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProviderEntity {
	@EmbeddedId
	private ServiceProviderEntityId id;

	@ManyToOne
	@MapsId("serviceId")
	private ServiceEntity service;

	@ManyToOne
	@MapsId("providerId")
	private ProviderEntity provider;

	@Column(name = "billing_rate_per_hour")
	private String billingRatePerHour;

	@Column(name = "description")
	private String description;

	@Column(name = "experience_in_months")
	private Long experienceInMonths;
}
