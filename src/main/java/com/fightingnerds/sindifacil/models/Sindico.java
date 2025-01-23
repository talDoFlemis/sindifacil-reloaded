package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class Sindico {
	@Id
	@Column(name = "cpf")
	private Long cpf;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cpf")
	private User user;
}
