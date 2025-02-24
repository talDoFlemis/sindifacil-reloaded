package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "sindifacil_managers")
public class SindifacilManagerEntity {
	@Id
	@Column(name = "user_id")
	private UUID id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private UserEntity user;
}
