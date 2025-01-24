package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class JointOwner {
	@Id
	@Column(name = "joint_owner_id")
	private String id;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "joint_owner_id", nullable = false)
	private User jointOwner;

	@OneToMany(
		mappedBy = "jointOwner",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<Property> properties;
}
