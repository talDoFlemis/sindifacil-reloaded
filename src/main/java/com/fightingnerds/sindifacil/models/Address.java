package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "street")
	private String street;

	@Column(name = "number")
	private String city;

	@Column(name = "zip_code")
	private String zipCode;
}
