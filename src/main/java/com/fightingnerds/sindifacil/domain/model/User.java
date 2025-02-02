package com.fightingnerds.sindifacil.domain.model;

import com.fightingnerds.sindifacil.domain.model.address.Address;
import jakarta.persistence.*;

@Entity
public class User {
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
