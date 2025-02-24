package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;

@Entity(name = "syndics")
public class SyndicEntity {
	@Id
	@Column(name = "syndic_id")
	private String id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "syndic_id")
	private UserEntity user;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "condominium_id")
	private CondominiumEntity condominium;
}
