package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;


import jakarta.persistence.*;

@Entity(name = "properties")
public class PropertyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity address;

	@ManyToOne(fetch = FetchType.LAZY)
	private CondominiumEntity condominium;

	@ManyToOne(fetch = FetchType.LAZY)
	private JointOwnerEntity jointOwner;
}