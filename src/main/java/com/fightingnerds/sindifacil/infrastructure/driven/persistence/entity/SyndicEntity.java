package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "syndics")
public class SyndicEntity {
	@Id
	@Column(name = "syndic_id")
	private UUID id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "syndic_id")
	private UserEntity user;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "condominium_id")
	private CondominiumEntity condominium;
}
