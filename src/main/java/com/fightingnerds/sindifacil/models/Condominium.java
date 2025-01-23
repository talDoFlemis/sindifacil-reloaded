package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Condominium {
	@Id
	private Long id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Property> properties;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cpf")
	private Sindico sindico;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;

}
