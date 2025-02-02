package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.UUID;

@Entity(name = "authorities")
public class AuthorityEntity {
	@Id
	@JdbcTypeCode(java.sql.Types.VARCHAR)
	private UUID id;

	public String authority;
}
