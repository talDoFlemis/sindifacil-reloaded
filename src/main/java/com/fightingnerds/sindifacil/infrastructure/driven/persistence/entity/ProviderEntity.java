package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "providers")
public class ProviderEntity {
	@Id
	@Column(name = "provider_id")
	private UUID id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "provider_id")
	private UserEntity user;

	@OneToOne(cascade = CascadeType.ALL)
	private AddressEntity officeAddress;
}
