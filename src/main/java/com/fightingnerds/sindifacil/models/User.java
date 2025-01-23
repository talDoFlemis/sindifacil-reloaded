package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	@Column(name = "cpf")
	private String cpf;

	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	private String cellphone;

	private String passwordHash;
}
