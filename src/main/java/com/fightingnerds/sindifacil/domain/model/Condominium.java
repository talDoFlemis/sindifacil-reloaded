package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Condominium {
	@Id
	private Long id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL,
		orphanRemoval = true,
		mappedBy = "condominium"
	)
	private List<Property> properties;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "cpf")
	private Syndic syndic;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;

}
