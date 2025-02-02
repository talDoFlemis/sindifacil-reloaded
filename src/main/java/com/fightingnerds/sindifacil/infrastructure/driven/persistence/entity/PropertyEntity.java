package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;


import com.fightingnerds.sindifacil.domain.model.Condominium;
import jakarta.persistence.*;

@Entity
public class PropertyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity address;

	@ManyToOne(fetch = FetchType.LAZY)
	private Condominium condominium;

	@ManyToOne(fetch = FetchType.LAZY)
	private JointOwnerEntity jointOwner;
}