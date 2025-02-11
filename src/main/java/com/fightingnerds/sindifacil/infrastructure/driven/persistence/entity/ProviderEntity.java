package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;

@Entity
public class ProviderEntity {
	@Id
	@Column(name = "provider_id")
	private String id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "provider_id")
	private UserEntity user;

	@OneToOne(cascade = CascadeType.ALL)
	private AddressEntity officeAddress;
}
