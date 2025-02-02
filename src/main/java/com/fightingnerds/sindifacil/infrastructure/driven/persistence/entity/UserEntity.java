package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.Set;
import java.util.UUID;

@Entity(name = "users")
public class UserEntity {
	@Id
	@JdbcTypeCode(java.sql.Types.VARCHAR)
	private UUID id;

	@OneToMany
	private Set<AuthorityEntity> authorities;

	@Column(name = "password")
	private String password;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", nullable = false)
	private AddressEntity address;

	private String cellphone;

	@Column(name = "name")
	private String name;

	@Column(name = "picture")
	private String picture;

	@Column(unique = true)
	private String username;

	@Column(name = "account_non_expired")
	private boolean accountNonExpired;

	@Column(name = "account_non_locked")
	private boolean accountNonLocked;

	@Column(name = "credentials_non_expired")
	private boolean credentialsNonExpired;

	@Column(name = "provider")
	private String provider;

	@Column(name = "provider_id")
	private String providerId;

	@Column(name = "enabled")
	private boolean enabled;
}
