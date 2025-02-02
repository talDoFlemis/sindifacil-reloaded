package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "addresses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "street")
	private String street;

	@Column(name = "number")
	private String city;

	@Column(name = "zip_code")
	private String zipCode;

	@Column(name = "complement")
	private String complement;

	@Column(name = "neighborhood")
	private String neighborhood;
}
