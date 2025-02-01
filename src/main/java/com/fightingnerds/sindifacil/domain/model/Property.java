package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@ManyToOne(fetch = FetchType.LAZY)
	private Condominium condominium;

	@ManyToOne(fetch = FetchType.LAZY)
	private JointOwner jointOwner;
}
