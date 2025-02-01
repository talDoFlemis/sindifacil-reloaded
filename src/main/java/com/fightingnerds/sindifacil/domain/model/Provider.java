package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class Provider {
	@Id
	@Column(name = "provider_id")
	private String id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "provider_id")
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	private Address officeAddress;
}
