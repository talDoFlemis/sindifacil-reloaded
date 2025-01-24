package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class Provider extends DateAudit {
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
