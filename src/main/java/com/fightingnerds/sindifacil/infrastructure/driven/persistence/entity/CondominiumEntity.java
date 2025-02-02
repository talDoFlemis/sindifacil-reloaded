package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import com.fightingnerds.sindifacil.domain.model.Syndic;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class CondominiumEntity {
	@Id
	private Long id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL,
		orphanRemoval = true,
		mappedBy = "condominium"
	)
	private List<PropertyEntity> properties;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "cpf")
	private Syndic syndic;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", nullable = false)
	private AddressEntity address;
}
