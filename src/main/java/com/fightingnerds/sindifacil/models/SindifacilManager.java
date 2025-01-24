package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class SindifacilManager extends DateAudit {
	@Id
	@Column(name = "user_id")
	private String id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
}
