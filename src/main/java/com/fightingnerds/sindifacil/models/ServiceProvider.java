package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;


@Entity
public class ServiceProvider {
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

	@Column(name = "description")
	private String description;

	@Column(name = "experience_in_months")
	private Long experienceInMonths;
}
