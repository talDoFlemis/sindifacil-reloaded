package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class JointOwner {
	@Id
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "joint_owner_id", nullable = false)
	private User joinOwner;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Property> properties;
}
