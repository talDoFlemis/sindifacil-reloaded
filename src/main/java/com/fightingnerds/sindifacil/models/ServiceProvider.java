package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;


@Entity
public class ServiceProvider extends DateAudit {
	@EmbeddedId
	private ServiceProviderId id;

	@ManyToOne
	@MapsId("serviceId")
	private Service service;

	@ManyToOne
	@MapsId("providerId")
	private Provider provider;

	@Column(name = "billing_rate_per_hour")
	private String billingRatePerHour;
}
