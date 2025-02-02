package com.fightingnerds.sindifacil.domain.model.user;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.UUID;

@Data
public class Authority implements GrantedAuthority {
	private UUID id;

	public String authority;
}