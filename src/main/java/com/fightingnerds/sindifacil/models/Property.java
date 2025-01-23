package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "condominium_id", referencedColumnName = "id", nullable = false)
	private Condominium condominium;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "joint_owner_cpf", nullable = true)
	private JointOwner jointOwner;
}
