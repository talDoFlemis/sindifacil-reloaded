package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class User extends DateAudit {
	@Id
	@Column(name = "cpf")
	private String cpf;

	private String email;

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	private String cellphone;

	@Column(name = "password_hash")
	private String passwordHash;
}
