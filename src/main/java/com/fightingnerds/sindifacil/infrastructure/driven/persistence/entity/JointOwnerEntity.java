package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.List;
import java.util.UUID;

@Entity
public class JointOwnerEntity {
	@Id
	@Column(name = "joint_owner_id")
	@JdbcTypeCode(java.sql.Types.VARCHAR)
	private UUID id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "joint_owner_id", nullable = false)
	private UserEntity jointOwner;

	@OneToMany(
		mappedBy = "jointOwner",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<PropertyEntity> properties;
}
