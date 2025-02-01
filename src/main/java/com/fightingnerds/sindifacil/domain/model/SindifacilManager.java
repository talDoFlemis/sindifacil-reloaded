package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class SindifacilManager {
	@Id
	@Column(name = "user_id")
	private String id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
}
