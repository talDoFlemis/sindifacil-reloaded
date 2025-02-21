package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class Syndic {
	@Id
	@Column(name = "syndic_id")
	private String id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "syndic_id")
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "condominium_id")
	private Condominium condominium;
}
